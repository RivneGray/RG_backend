package generated.user.api;

import ua.rivnegray.boardgames_shop.DTO.request.AddAndUpdateAddressDto;
import ua.rivnegray.boardgames_shop.DTO.response.AddressDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateAnyUserDto;
import ua.rivnegray.boardgames_shop.DTO.response.FavouriteProductCreationResponseDto;
import ua.rivnegray.boardgames_shop.DTO.response.FavouriteProductDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.MapProductInFavouritesDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateEmailDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateNameAndSurnameDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdatePasswordDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdatePhoneDto;
import ua.rivnegray.boardgames_shop.DTO.response.UserPublicDto;
import ua.rivnegray.boardgames_shop.DTO.response.UserRoleDto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
@Controller
@RequestMapping("${openapi.user.base-path:}")
public class UsersApiController implements UsersApi {

    private final UsersApiDelegate delegate;

    public UsersApiController(@Autowired(required = false) UsersApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UsersApiDelegate() {});
    }

    @Override
    public UsersApiDelegate getDelegate() {
        return delegate;
    }

}
