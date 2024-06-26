/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package generated.reservations.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;
import org.springframework.security.access.prepost.PreAuthorize;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "reservations", description = "the reservations API")
public interface ReservationsApi {

    default ReservationsApiDelegate getDelegate() {
        return new ReservationsApiDelegate() {};
    }

    /**
     * GET /reservations : Get a list of all reservations
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsGet",
        summary = "Get a list of all reservations",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reservations"
    )
    default ResponseEntity<Void> reservationsGet(
        
    ) {
        return getDelegate().reservationsGet();
    }


    /**
     * GET /reservations/me : Get all reservations for the logged-in user
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsMeGet",
        summary = "Get all reservations for the logged-in user",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reservations/me"
    )
    default ResponseEntity<Void> reservationsMeGet(
        
    ) {
        return getDelegate().reservationsMeGet();
    }


    /**
     * DELETE /reservations/me/{reservationId} : Cancel a user&#39;s specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsMeReservationIdDelete",
        summary = "Cancel a user's specific reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/reservations/me/{reservationId}"
    )
    default ResponseEntity<Void> reservationsMeReservationIdDelete(
        @Parameter(name = "reservationId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("reservationId") String reservationId
    ) {
        return getDelegate().reservationsMeReservationIdDelete(reservationId);
    }


    /**
     * GET /reservations/me/{reservationId} : Get details of a user&#39;s specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsMeReservationIdGet",
        summary = "Get details of a user's specific reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reservations/me/{reservationId}"
    )
    default ResponseEntity<Void> reservationsMeReservationIdGet(
        @Parameter(name = "reservationId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("reservationId") String reservationId
    ) {
        return getDelegate().reservationsMeReservationIdGet(reservationId);
    }


    /**
     * PATCH /reservations/me/{reservationId} : Update a user&#39;s specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsMeReservationIdPatch",
        summary = "Update a user's specific reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/reservations/me/{reservationId}"
    )
    default ResponseEntity<Void> reservationsMeReservationIdPatch(
        @Parameter(name = "reservationId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("reservationId") String reservationId
    ) {
        return getDelegate().reservationsMeReservationIdPatch(reservationId);
    }


    /**
     * POST /reservations : Create a new reservation
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsPost",
        summary = "Create a new reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reservations"
    )
    default ResponseEntity<Void> reservationsPost(
        
    ) {
        return getDelegate().reservationsPost();
    }


    /**
     * DELETE /reservations/{reservationId} : Delete a specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsReservationIdDelete",
        summary = "Delete a specific reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/reservations/{reservationId}"
    )
    default ResponseEntity<Void> reservationsReservationIdDelete(
        @Parameter(name = "reservationId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("reservationId") String reservationId
    ) {
        return getDelegate().reservationsReservationIdDelete(reservationId);
    }


    /**
     * GET /reservations/{reservationId} : Get details of a specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsReservationIdGet",
        summary = "Get details of a specific reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reservations/{reservationId}"
    )
    default ResponseEntity<Void> reservationsReservationIdGet(
        @Parameter(name = "reservationId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("reservationId") String reservationId
    ) {
        return getDelegate().reservationsReservationIdGet(reservationId);
    }


    /**
     * PATCH /reservations/{reservationId} : Update a specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "reservationsReservationIdPatch",
        summary = "Update a specific reservation",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content)
        }
    )
    @PreAuthorize("permitAll")
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/reservations/{reservationId}"
    )
    default ResponseEntity<Void> reservationsReservationIdPatch(
        @Parameter(name = "reservationId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("reservationId") String reservationId
    ) {
        return getDelegate().reservationsReservationIdPatch(reservationId);
    }

}
