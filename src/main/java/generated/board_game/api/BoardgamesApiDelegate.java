package generated.board_game.api;

import ua.rivnegray.boardgames_shop.DTO.response.BoardGameDto;
import ua.rivnegray.boardgames_shop.DTO.response.BoardGameGenreDto;
import ua.rivnegray.boardgames_shop.DTO.response.BoardGameMechanicDto;
import ua.rivnegray.boardgames_shop.DTO.response.BoardGameSummaryDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateAndUpdateBoardGameDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateAndUpdateBoardGameGenreDto;
import ua.rivnegray.boardgames_shop.DTO.request.create.CreateAndUpdateBoardGameMechanicDto;
import ua.rivnegray.boardgames_shop.DTO.request.FilterBoardGamesRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link BoardgamesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface BoardgamesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /boardgames : Add a new boardgame
     *
     * @param createAndUpdateBoardGameDto Boardgame to add (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#addBoardGame
     */
    default ResponseEntity<BoardGameDto> addBoardGame(CreateAndUpdateBoardGameDto createAndUpdateBoardGameDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productImageURL\" : \"productImageURL\", \"maxPlayers\" : 2, \"minPlayers\" : 5, \"gameSet\" : \"gameSet\", \"gameMechanicMechanicNames\" : [ \"gameMechanicMechanicNames\", \"gameMechanicMechanicNames\" ], \"BGGLink\" : \"https://openapi-generator.tech\", \"productName\" : \"productName\", \"dateUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"isRemoved\" : true, \"productCode\" : \"productCode\", \"minAge\" : 5, \"Manufacturer\" : \"Manufacturer\", \"minGameDuration\" : 7, \"maxGameDuration\" : 9, \"id\" : 0, \"gameGenreGenreNames\" : [ \"gameGenreGenreNames\", \"gameGenreGenreNames\" ], \"productDescription\" : \"productDescription\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /boardgames/genres : Add a new genre
     *
     * @param createAndUpdateBoardGameGenreDto Genre to add (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#addGenre
     */
    default ResponseEntity<BoardGameGenreDto> addGenre(CreateAndUpdateBoardGameGenreDto createAndUpdateBoardGameGenreDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"genreDescription\" : \"genreDescription\", \"genreName\" : \"genreName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /boardgames/mechanics : Add a new mechanic
     *
     * @param createAndUpdateBoardGameMechanicDto Mechanic to add (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#addMechanic
     */
    default ResponseEntity<BoardGameMechanicDto> addMechanic(CreateAndUpdateBoardGameMechanicDto createAndUpdateBoardGameMechanicDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mechanicDescription\" : \"mechanicDescription\", \"mechanicName\" : \"mechanicName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /boardgames/archive/{id} : archive board game
     *
     * @param id ID of the board game to archive (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#archiveBoardGame
     */
    default ResponseEntity<BoardGameDto> archiveBoardGame(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productImageURL\" : \"productImageURL\", \"maxPlayers\" : 2, \"minPlayers\" : 5, \"gameSet\" : \"gameSet\", \"gameMechanicMechanicNames\" : [ \"gameMechanicMechanicNames\", \"gameMechanicMechanicNames\" ], \"BGGLink\" : \"https://openapi-generator.tech\", \"productName\" : \"productName\", \"dateUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"isRemoved\" : true, \"productCode\" : \"productCode\", \"minAge\" : 5, \"Manufacturer\" : \"Manufacturer\", \"minGameDuration\" : 7, \"maxGameDuration\" : 9, \"id\" : 0, \"gameGenreGenreNames\" : [ \"gameGenreGenreNames\", \"gameGenreGenreNames\" ], \"productDescription\" : \"productDescription\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /boardgames/{id} : Delete a boardgame
     *
     * @param id ID of the boardgame to delete (required)
     * @return No Content (status code 204)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#deleteBoardGame
     */
    default ResponseEntity<Void> deleteBoardGame(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /boardgames/genres/{id} : Delete a genre
     *
     * @param id ID of the genre to delete (required)
     * @return No Content (status code 204)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#deleteGenre
     */
    default ResponseEntity<Void> deleteGenre(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /boardgames/mechanics/{id} : Delete a mechanic
     *
     * @param id ID of the mechanic to delete (required)
     * @return No Content (status code 204)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#deleteMechanic
     */
    default ResponseEntity<Void> deleteMechanic(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /boardgames/filter/ : filter boardgames
     *
     * @param filterBoardGamesRequestDto map of filter properties with their values (required)
     * @return Filtered successfully (status code 200)
     * @see BoardgamesApi#filterBoardGames
     */
    default ResponseEntity<List<BoardGameSummaryDto>> filterBoardGames(FilterBoardGamesRequestDto filterBoardGamesRequestDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }, { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/archived/ : get all archived boardgames
     *
     * @return OK (status code 200)
     * @see BoardgamesApi#getAllArchivedBoardGames
     */
    default ResponseEntity<List<BoardGameSummaryDto>> getAllArchivedBoardGames() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }, { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames : Get all boardgames
     *
     * @return OK (status code 200)
     * @see BoardgamesApi#getAllBoardGames
     */
    default ResponseEntity<List<BoardGameSummaryDto>> getAllBoardGames() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }, { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/genres : Get all genres
     *
     * @return OK (status code 200)
     * @see BoardgamesApi#getAllGenres
     */
    default ResponseEntity<List<BoardGameGenreDto>> getAllGenres() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"genreDescription\" : \"genreDescription\", \"genreName\" : \"genreName\", \"id\" : 0 }, { \"genreDescription\" : \"genreDescription\", \"genreName\" : \"genreName\", \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/mechanics : Get all mechanics
     *
     * @return OK (status code 200)
     * @see BoardgamesApi#getAllMechanics
     */
    default ResponseEntity<List<BoardGameMechanicDto>> getAllMechanics() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"mechanicDescription\" : \"mechanicDescription\", \"mechanicName\" : \"mechanicName\", \"id\" : 0 }, { \"mechanicDescription\" : \"mechanicDescription\", \"mechanicName\" : \"mechanicName\", \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/{id} : Get a boardgame by id
     *
     * @param id ID of the boardgame (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     * @see BoardgamesApi#getBoardGameById
     */
    default ResponseEntity<BoardGameDto> getBoardGameById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productImageURL\" : \"productImageURL\", \"maxPlayers\" : 2, \"minPlayers\" : 5, \"gameSet\" : \"gameSet\", \"gameMechanicMechanicNames\" : [ \"gameMechanicMechanicNames\", \"gameMechanicMechanicNames\" ], \"BGGLink\" : \"https://openapi-generator.tech\", \"productName\" : \"productName\", \"dateUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"isRemoved\" : true, \"productCode\" : \"productCode\", \"minAge\" : 5, \"Manufacturer\" : \"Manufacturer\", \"minGameDuration\" : 7, \"maxGameDuration\" : 9, \"id\" : 0, \"gameGenreGenreNames\" : [ \"gameGenreGenreNames\", \"gameGenreGenreNames\" ], \"productDescription\" : \"productDescription\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/genres/{id} : Get a genre by id
     *
     * @param id ID of the genre (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     * @see BoardgamesApi#getGenreById
     */
    default ResponseEntity<BoardGameGenreDto> getGenreById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"genreDescription\" : \"genreDescription\", \"genreName\" : \"genreName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/mechanics/{id} : Get a mechanic by id
     *
     * @param id ID of the mechanic (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     * @see BoardgamesApi#getMechanicById
     */
    default ResponseEntity<BoardGameMechanicDto> getMechanicById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mechanicDescription\" : \"mechanicDescription\", \"mechanicName\" : \"mechanicName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /boardgames/search/{searchValue} : search
     *
     * @param searchValue search value for performing search on boardgames (required)
     * @return OK (status code 200)
     * @see BoardgamesApi#searchBoardgames
     */
    default ResponseEntity<List<BoardGameSummaryDto>> searchBoardgames(String searchValue) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }, { \"productImageURL\" : \"productImageURL\", \"id\" : 0, \"productName\" : \"productName\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /boardgames/unarchive/{id} : unarchive board game
     *
     * @param id ID of the board game to unarchive (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#unarchiveBoardGame
     */
    default ResponseEntity<BoardGameDto> unarchiveBoardGame(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productImageURL\" : \"productImageURL\", \"maxPlayers\" : 2, \"minPlayers\" : 5, \"gameSet\" : \"gameSet\", \"gameMechanicMechanicNames\" : [ \"gameMechanicMechanicNames\", \"gameMechanicMechanicNames\" ], \"BGGLink\" : \"https://openapi-generator.tech\", \"productName\" : \"productName\", \"dateUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"isRemoved\" : true, \"productCode\" : \"productCode\", \"minAge\" : 5, \"Manufacturer\" : \"Manufacturer\", \"minGameDuration\" : 7, \"maxGameDuration\" : 9, \"id\" : 0, \"gameGenreGenreNames\" : [ \"gameGenreGenreNames\", \"gameGenreGenreNames\" ], \"productDescription\" : \"productDescription\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /boardgames/{id} : Update a boardgame
     *
     * @param id ID of the boardgame to update (required)
     * @param createAndUpdateBoardGameDto Boardgame to update (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#updateBoardGame
     */
    default ResponseEntity<BoardGameDto> updateBoardGame(Long id,
        CreateAndUpdateBoardGameDto createAndUpdateBoardGameDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productImageURL\" : \"productImageURL\", \"maxPlayers\" : 2, \"minPlayers\" : 5, \"gameSet\" : \"gameSet\", \"gameMechanicMechanicNames\" : [ \"gameMechanicMechanicNames\", \"gameMechanicMechanicNames\" ], \"BGGLink\" : \"https://openapi-generator.tech\", \"productName\" : \"productName\", \"dateUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"isRemoved\" : true, \"productCode\" : \"productCode\", \"minAge\" : 5, \"Manufacturer\" : \"Manufacturer\", \"minGameDuration\" : 7, \"maxGameDuration\" : 9, \"id\" : 0, \"gameGenreGenreNames\" : [ \"gameGenreGenreNames\", \"gameGenreGenreNames\" ], \"productDescription\" : \"productDescription\", \"productPrice\" : 6.0274563, \"productQuantityInStock\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /boardgames/genres/{id} : Update a genre
     *
     * @param id ID of the genre to update (required)
     * @param createAndUpdateBoardGameGenreDto Genre to update (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#updateGenre
     */
    default ResponseEntity<BoardGameGenreDto> updateGenre(Long id,
        CreateAndUpdateBoardGameGenreDto createAndUpdateBoardGameGenreDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"genreDescription\" : \"genreDescription\", \"genreName\" : \"genreName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /boardgames/mechanics/{id} : Update a mechanic
     *
     * @param id ID of the mechanic to update (required)
     * @param createAndUpdateBoardGameMechanicDto Mechanic to update (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     *         or Unauthorized (status code 401)
     * @see BoardgamesApi#updateMechanic
     */
    default ResponseEntity<BoardGameMechanicDto> updateMechanic(Long id,
        CreateAndUpdateBoardGameMechanicDto createAndUpdateBoardGameMechanicDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mechanicDescription\" : \"mechanicDescription\", \"mechanicName\" : \"mechanicName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
