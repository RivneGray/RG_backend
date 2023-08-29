/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
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
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.rivnegray.boardgames_shop.DTO.request.RegisterRequestWithMapShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.response.LoginResponseDto;

import javax.annotation.Generated;
import javax.validation.Valid;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
    @Validated
    @Tag(name = "register", description = "the register API")
    public interface RegisterApi {

                default RegisterApiDelegate getDelegate() {
                return new RegisterApiDelegate() {};
                }

            /**
            * POST /register : Register a new user
            *
                * @param registerRequestWithMapShoppingCartDto  (required)
            * @return Registration successful (status code 201)
                *         or Bad Request (status code 400)
                *         or Conflict, e.g., email already in use (status code 409)
            */
                @Operation(
                operationId = "registerUser",
                    summary = "Register a new user",
                responses = {
                    @ApiResponse(responseCode = "201", description = "Registration successful", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = LoginResponseDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content),
                    @ApiResponse(responseCode = "409", description = "Conflict, e.g., email already in use", content = @Content)
                }
                )
                        @PreAuthorize("permitAll")
            @RequestMapping(
            method = RequestMethod.POST,
            value = "/register",
            produces = { "application/json" },
            consumes = { "application/json" }
            )
        default ResponseEntity<LoginResponseDto> registerUser(
        @Parameter(name = "RegisterRequestWithMapShoppingCartDto", description = "", required = true) @Valid @RequestBody RegisterRequestWithMapShoppingCartDto registerRequestWithMapShoppingCartDto
            ) {
            return getDelegate().registerUser(registerRequestWithMapShoppingCartDto);
            }

        }
