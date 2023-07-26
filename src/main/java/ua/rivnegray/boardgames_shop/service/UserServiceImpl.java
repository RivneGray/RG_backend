package ua.rivnegray.boardgames_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import ua.rivnegray.boardgames_shop.DTO.request.AddAndUpdateAddressDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateAnyUserDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateCustomerUserDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateEmailDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdatePasswordDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdatePhoneDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateUsernameDto;
import ua.rivnegray.boardgames_shop.DTO.response.AddressDto;
import ua.rivnegray.boardgames_shop.DTO.response.UserPublicDto;
import ua.rivnegray.boardgames_shop.DTO.response.UserRoleDto;
import ua.rivnegray.boardgames_shop.exceptions.notFoundExceptions.AddressIdNotFoundException;
import ua.rivnegray.boardgames_shop.exceptions.notFoundExceptions.UserIdNotFoundException;
import ua.rivnegray.boardgames_shop.mapper.UserMapper;
import ua.rivnegray.boardgames_shop.model.Address;
import ua.rivnegray.boardgames_shop.model.UserCredentials;
import ua.rivnegray.boardgames_shop.model.UserProfile;
import ua.rivnegray.boardgames_shop.repository.AddressRepository;
import ua.rivnegray.boardgames_shop.repository.UserCredentialsRepository;
import ua.rivnegray.boardgames_shop.repository.UserProfileRepository;
import ua.rivnegray.boardgames_shop.repository.UserRoleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    UserCredentialsRepository userCredentialsRepository;
    UserProfileRepository userProfileRepository;

    UserRoleRepository userRoleRepository;

    AddressRepository userAddressRepository;

    UserMapper userMapper;
    PasswordEncoder passwordEncoder;
    @Autowired
    public UserServiceImpl(UserCredentialsRepository userCredentialsRepository, UserProfileRepository userProfileRepository
            , UserRoleRepository userRoleRepository, UserMapper userMapper, PasswordEncoder passwordEncoder,
            AddressRepository userAddressRepository) {
        this.userCredentialsRepository = userCredentialsRepository;
        this.userProfileRepository = userProfileRepository;
        this.userRoleRepository = userRoleRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
        this.userAddressRepository = userAddressRepository;
    }

    private UserPublicDto doUserSaveOperations(UserProfile userProfile, UserCredentials userCredentials) {
        userCredentials.setPassword(this.passwordEncoder.encode(userCredentials.getPassword()));
        userCredentials.setUserProfile(userProfile);
        userProfile.setUserCredentials(userCredentials);

        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userProfile));
    }
    private UserProfile getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Jwt jwtPrincipal = (Jwt) authentication.getPrincipal();
        String username = jwtPrincipal.getSubject();

        return this.userProfileRepository.findByUserCredentials_Username(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));
    }

    @Override
    public List<UserPublicDto> getAllUsersPublicInfo() {
        return this.userProfileRepository.findAll().stream()
                .map(userProfile -> this.userMapper.toUserPublicDto(userProfile))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public UserPublicDto getUserPublicInfoById(Long id) {
        return this.userProfileRepository.findById(id)
                .map(userProfile -> this.userMapper.toUserPublicDto(userProfile))
                .orElseThrow(() -> new UserIdNotFoundException(id));
    }

    @Override
    public UserPublicDto createSpecifiedUser(CreateAnyUserDto createAnyUserDto) {
        return doUserSaveOperations(this.userMapper.toUserProfile(createAnyUserDto, this.userRoleRepository),
                this.userMapper.toUserCredentials(createAnyUserDto));
    }

    @Override
    public UserPublicDto createCustomerUser(CreateCustomerUserDto createCustomerUserDto) {
        return doUserSaveOperations(this.userMapper.toUserProfile(createCustomerUserDto, this.userRoleRepository),
                this.userMapper.toUserCredentials(createCustomerUserDto));
    }

    @Override
    public UserPublicDto updateUsername(UpdateUsernameDto updateUsernameDto) {
        UserProfile userToUpdate = this.getCurrentUser();

        userToUpdate.getUserCredentials().setUsername(updateUsernameDto.username());
        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userToUpdate));
    }

    @Override
    public UserPublicDto updatePassword(UpdatePasswordDto updatePasswordDto) {
        UserProfile userToUpdate = this.getCurrentUser();

        userToUpdate.getUserCredentials().setPassword(this.passwordEncoder.encode(updatePasswordDto.password()));
        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userToUpdate));

    }

    @Override
    public UserPublicDto updateEmail(UpdateEmailDto updateEmailDto) {
        UserProfile userToUpdate = this.getCurrentUser();

        userToUpdate.setEmail(updateEmailDto.email());
        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userToUpdate));

    }

    @Override
    public UserPublicDto updatePhone(UpdatePhoneDto updatePhoneDto) {
        UserProfile userToUpdate = this.getCurrentUser();

        userToUpdate.setPhone(updatePhoneDto.phone());
        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userToUpdate));

    }

    @Override
    public UserPublicDto updateAddress(Long addressId, AddAndUpdateAddressDto updateAddressDto) {
        UserProfile userToUpdate = this.getCurrentUser();

        Address addressToUpdate = userToUpdate.getAddresses().stream()
                .filter(address -> address.getId().equals(addressId))
                .findFirst()
                .orElseThrow(() -> new AddressIdNotFoundException(addressId));

        this.userMapper.updateAddress(addressToUpdate, updateAddressDto);

        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userToUpdate));

    }

    @Override
    public UserPublicDto addAddress(AddAndUpdateAddressDto addAddressDto) {
        UserProfile userToUpdate = this.getCurrentUser();

        Address addressToAdd = this.userMapper.toAddress(addAddressDto);
        userToUpdate.getAddresses().add(addressToAdd);
        return this.userMapper.toUserPublicDto(this.userProfileRepository.save(userToUpdate));
    }

    @Override
    public void removeAddress(Long addressId) {
        UserProfile userToUpdate = this.getCurrentUser();

        userToUpdate.getAddresses().removeIf(address -> address.getId().equals(addressId));
        this.userProfileRepository.save(userToUpdate);

    }

    @Override
    public void deleteUser(Long id) {
        this.userProfileRepository.deleteById(id);
    }

    @Override
    public List<UserRoleDto> getAllUserRoles() {
        return this.userRoleRepository.findAll().stream()
                .map(userRole -> this.userMapper.toUserRoleDto(userRole))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public UserPublicDto getCurrentUserPublicInfo() {
        return this.userMapper.toUserPublicDto(getCurrentUser());
    }

    @Override
    public List<UserPublicDto> getUsersPublicInfoByRole(String role) {
        return this.userProfileRepository.findByRoles_RoleName(role).stream()
                .map(userProfile -> this.userMapper.toUserPublicDto(userProfile))
                .collect(Collectors.toCollection(ArrayList::new));
    }

//    @Override
//    public Boolean isEmailAvailable(UpdateEmailDto updateEmailDto) {
//        return this.userProfileRepository.existsByEmail(updateEmailDto.email());
//    }
//
//    @Override
//    public Boolean isUsernameAvailable(UpdateUsernameDto updateUsernameDto) {
//        return this.userProfileRepository.existsByUserCredentials_Username(updateUsernameDto.username());
//    }

    @Override
    public AddressDto getAddress(Long addressId) {
        return this.userMapper.toAddressDto(this.userAddressRepository.findById(addressId)
                .orElseThrow(() -> new AddressIdNotFoundException(addressId)));
    }

    @Override
    public List<AddressDto> getAllAddresses() {
        UserProfile userProfileTiGetAddressesFrom = this.getCurrentUser();

        return userProfileTiGetAddressesFrom.getAddresses().stream()
                .map(address -> this.userMapper.toAddressDto(address))
                .collect(Collectors.toCollection(ArrayList::new));

    }


}
