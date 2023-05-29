package ua.rivnegray.boardgames_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ua.rivnegray.boardgames_shop.DTO.request.AddAndUpdateAddressDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateAnyUserDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateCustomerUserDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateEmailDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateFullUserProfileDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdatePasswordDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdatePhoneDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateUsernameDto;
import ua.rivnegray.boardgames_shop.DTO.response.UserPublicDto;
import ua.rivnegray.boardgames_shop.mapper.UserMapper;
import ua.rivnegray.boardgames_shop.model.UserCredentials;
import ua.rivnegray.boardgames_shop.model.UserProfile;
import ua.rivnegray.boardgames_shop.model.UserRole;
import ua.rivnegray.boardgames_shop.repository.UserCredentialsRepository;
import ua.rivnegray.boardgames_shop.repository.UserProfileRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    UserCredentialsRepository userCredentialsRepository;
    UserProfileRepository userProfileRepository;
    UserRoleService userRoleService;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;
    @Autowired
    public UserServiceImpl(UserCredentialsRepository userCredentialsRepository, UserProfileRepository userProfileRepository
            , UserRoleService userRoleService, UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userCredentialsRepository = userCredentialsRepository;
        this.userProfileRepository = userProfileRepository;
        this.userRoleService = userRoleService;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<UserPublicDto> getAllUsersPublicInfo() {
        return this.userProfileRepository.findAll().stream()
                .map(userProfile -> this.userMapper.toUserPublicDto(userProfile))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Optional<UserPublicDto> getUserPublicInfoById(Long id) {
        return this.userProfileRepository.findById(id).map(userProfile -> this.userMapper.toUserPublicDto(userProfile));
    }


    //todo figure out on which level the encryption of password should occur. Is it service layer, mapper,
    // or should DTO already have an encrypted password
    @Override
    public UserPublicDto createSpecifiedUser(CreateAnyUserDto createAnyUserDto) {
        return doUserSaveOperations(this.userMapper.toUserProfile(createAnyUserDto, this.userRoleService), this.userMapper.toUserCredentials(createAnyUserDto));
    }

    @Override
    public UserPublicDto createCustomerUser(CreateCustomerUserDto createCustomerUserDto) {
        UserProfile newUserProfile = this.userMapper.toUserProfile(createCustomerUserDto, this.userRoleService);
        UserRole roleUser = this.userRoleService.findRoleById(2L);
        newUserProfile.getRoles().add(roleUser);
        return doUserSaveOperations(newUserProfile, this.userMapper.toUserCredentials(createCustomerUserDto));
    }

    private UserPublicDto doUserSaveOperations(UserProfile userProfile, UserCredentials userCredentials) {
        userCredentials.setPassword(this.passwordEncoder.encode(userCredentials.getPassword()));
        userCredentials.setUserProfile(userProfile);
        userProfile.setUserCredentials(userCredentials);

        this.userProfileRepository.save(userProfile);

        return this.userMapper.toUserPublicDto(userProfile);
    }

    @Override
    public UserPublicDto updateFullUserProfile(UpdateFullUserProfileDto updateFullUserProfileDto) {
        return null;
    }

    @Override
    public void updateUsername(UpdateUsernameDto updateUsernameDto) {

    }

    @Override
    public void updatePassword(UpdatePasswordDto updatePasswordDto) {

    }

    @Override
    public void updateEmail(UpdateEmailDto updateEmailDto) {

    }

    @Override
    public void updatePhone(UpdatePhoneDto updatePhoneDto) {

    }

    @Override
    public void updateAddress(AddAndUpdateAddressDto updateAddressDto) {

    }

    @Override
    public void addAddress(AddAndUpdateAddressDto addAddressDto) {

    }

    @Override
    public void removeAddress(Long userId, Long addressId) {

    }

    @Override
    public void deleteUser(Long id) {

    }

//    private final UserRepository userRepository;
//    private final UserRoleRepository roleRepository;
//
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository, UserRoleRepository roleRepository) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//    }
//
//    @Override
//    public List<User> getAllSecureUsers() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public Optional<User> getSecureUserById(Long id) {
//        return userRepository.findById(id);
//    }
//
//    private Set<UserRole>  getPersistedRolesIntoSession(User user){
//        Set<UserRole> persistentRoles = new HashSet<>();
//        for (UserRole role : user.getRoles()) {
//            UserRole persistentRole = roleRepository.findById(role.getId())
//                    .orElseThrow(() -> new RuntimeException("Role not found"));
//            persistentRoles.add(persistentRole);
//        }
//        return persistentRoles;
//    }
//
//    @Override
//    public User createUser(User user) {
//        user.setRoles(getPersistedRolesIntoSession(user));
//        return userRepository.save(user);
//    }
//
//
//
//    @Override
//    public User updateUser(User user) {
//        return this.userRepository.save(user);
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }

//    UserCredentialsRepository userCredentialsRepository;
//    UserProfileRepository userProfileRepository;
//    UserRoleRepository roleRepository;
//
//    @Autowired
//    public UserServiceImpl(UserCredentialsRepository userCredentialsRepository, UserProfileRepository userProfileRepository, UserRoleRepository roleRepository) {
//        this.userCredentialsRepository = userCredentialsRepository;
//        this.userProfileRepository = userProfileRepository;
//        this.roleRepository = roleRepository;
//    }
//
//    @Override
//    public List<UserFullDto> getAllSecureUsers() {
//        List<UserProfile> userProfiles = this.userProfileRepository.findAll();
//
//
//        //todo mapping sepperatly
//        return userProfiles.stream()
//                .map(userProfile -> UserFullDto.builder()
//                        .id(userProfile.getId())
//                        .username(userProfile.getUserCredentials().getUsername())
//                        .phone(userProfile.getPhone())
//                        .email(userProfile.getEmail())
//                        .imageUrl(userProfile.getImageUrl())
//                        .roles(userProfile.getUserCredentials().getRoles())
//                        .build())
//               .collect(Collectors.toCollection(ArrayList::new));
//    }
//
//    @Override
//    public Optional<UserFullDto> getSecureUserById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<UserPublicDto> getAllUnsecureUsers() {
//        return null;
//    }
//
//    @Override
//    public Optional<UserPublicDto> getUnsecureUserById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public UserFullDto createUser(CreateAndUpdateUserDto user) {
//        return null;
//    }
//
//    @Override
//    public UserFullDto updateUser(CreateAndUpdateUserDto user) {
//        return null;
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//
//    }
//
//    @Override
//    public UserFullDto updateUserProfile(final UserProfileDto userProfileDto) {
//        final UserProfile userProfile = this.userProfileRepository.save(UserProfile.builder()
//                .id(userProfileDto.getId())
//                .email(userProfileDto.getEmail())
//                .phone(userProfileDto.getPhone())
//                .imageUrl(userProfileDto.getImageUrl())
//                .build());
//
//        return  UserFullDto.builder()
//                .id(userProfile.getId())
//                .username(userProfile.getUserCredentials().getUsername())
//                .phone(userProfile.getPhone())
//                .email(userProfile.getEmail())
//                .imageUrl(userProfile.getImageUrl())
//                .roles(userProfile.getUserCredentials().getRoles())
//                .build();
//    }
}
