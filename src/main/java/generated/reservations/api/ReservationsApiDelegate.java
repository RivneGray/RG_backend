package generated.reservations.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link ReservationsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public interface ReservationsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /reservations : Get a list of all reservations
     *
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsGet
     */
    default ResponseEntity<Void> reservationsGet() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /reservations/me : Get all reservations for the logged-in user
     *
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsMeGet
     */
    default ResponseEntity<Void> reservationsMeGet() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /reservations/me/{reservationId} : Cancel a user&#39;s specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsMeReservationIdDelete
     */
    default ResponseEntity<Void> reservationsMeReservationIdDelete(String reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /reservations/me/{reservationId} : Get details of a user&#39;s specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsMeReservationIdGet
     */
    default ResponseEntity<Void> reservationsMeReservationIdGet(String reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /reservations/me/{reservationId} : Update a user&#39;s specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsMeReservationIdPatch
     */
    default ResponseEntity<Void> reservationsMeReservationIdPatch(String reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /reservations : Create a new reservation
     *
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsPost
     */
    default ResponseEntity<Void> reservationsPost() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /reservations/{reservationId} : Delete a specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsReservationIdDelete
     */
    default ResponseEntity<Void> reservationsReservationIdDelete(String reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /reservations/{reservationId} : Get details of a specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsReservationIdGet
     */
    default ResponseEntity<Void> reservationsReservationIdGet(String reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /reservations/{reservationId} : Update a specific reservation
     *
     * @param reservationId  (required)
     * @return Success (status code 200)
     * @see ReservationsApi#reservationsReservationIdPatch
     */
    default ResponseEntity<Void> reservationsReservationIdPatch(String reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
