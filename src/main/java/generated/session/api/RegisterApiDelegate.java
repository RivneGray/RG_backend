package generated.session.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import ua.rivnegray.boardgames_shop.DTO.request.RegisterRequestWithMapShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.response.LoginResponseDto;

import javax.annotation.Generated;
import java.util.Optional;

/**
 * A delegate to be called by the {@link RegisterApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface RegisterApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /register : Register a new user
     *
     * @param registerRequestWithMapShoppingCartDto  (required)
     * @return Registration successful (status code 201)
     *         or Bad Request (status code 400)
     *         or Conflict, e.g., email already in use (status code 409)
     * @see RegisterApi#registerUser
     */
    default ResponseEntity<LoginResponseDto> registerUser(RegisterRequestWithMapShoppingCartDto registerRequestWithMapShoppingCartDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"user\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"addresses\" : [ { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"houseNumber\" : \"houseNumber\", \"id\" : 6 }, { \"country\" : \"country\", \"city\" : \"city\", \"street\" : \"street\", \"postalCode\" : \"postalCode\", \"houseNumber\" : \"houseNumber\", \"id\" : 6 } ], \"phone\" : \"phone\", \"roles\" : [ { \"permissions\" : [ null, null ], \"roleName\" : \"roleName\", \"id\" : 0 }, { \"permissions\" : [ null, null ], \"roleName\" : \"roleName\", \"id\" : 0 } ], \"email\" : \"email\", \"username\" : \"username\" }, \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
