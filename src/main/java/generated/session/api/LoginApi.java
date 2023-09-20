/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package generated.session.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.rivnegray.boardgames_shop.DTO.request.LoginRequestWithMapShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.response.LoginResponseDto;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "login", description = "the login API")
public interface LoginApi {

    default LoginApiDelegate getDelegate() {
        return new LoginApiDelegate() {};
    }

    /**
     * POST /login : Log in a user
     *
     * @param loginRequestWithMapShoppingCartDto  (required)
     * @return Successful operation (status code 200)
     *         or Bad Request (status code 400)
     *         or Conflict, e.g., email already in use (status code 409)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Log in a user",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginResponseDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content),
            @ApiResponse(responseCode = "409", description = "Conflict, e.g., email already in use", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LoginResponseDto> loginUser(
        @Parameter(name = "LoginRequestWithMapShoppingCartDto", description = "", required = true) @Valid @RequestBody LoginRequestWithMapShoppingCartDto loginRequestWithMapShoppingCartDto
    ) {
        return getDelegate().loginUser(loginRequestWithMapShoppingCartDto);
    }

}
