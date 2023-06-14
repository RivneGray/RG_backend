/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package generated.shopping_cart.api;

import ua.rivnegray.boardgames_shop.DTO.request.create.AddProductInShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.response.ProductInShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.response.ShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateQuantityOfProductInShoppingCartDto;
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

    import javax.validation.Valid;
    import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.security.access.prepost.PreAuthorize;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-13T10:49:05.541140880+03:00[Europe/Kiev]")
    @Validated
    @Tag(name = "shoppingCart", description = "the shoppingCart API")
    public interface ShoppingCartApi {

                default ShoppingCartApiDelegate getDelegate() {
                return new ShoppingCartApiDelegate() {};
                }

            /**
            * POST /shoppingCart/{cartId}/products : Adds a product to the shopping cart
            *
                * @param cartId  (required)
                * @param addProductInShoppingCartDto  (required)
            * @return Product added successfully (status code 201)
                *         or Invalid product data (status code 400)
            */
                @Operation(
                operationId = "addProductToShoppingCart",
                    summary = "Adds a product to the shopping cart",
                responses = {
                    @ApiResponse(responseCode = "201", description = "Product added successfully", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = ShoppingCartDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Invalid product data")
                }
                )
            @PreAuthorize("hasAuthority('')")
            @RequestMapping(
            method = RequestMethod.POST,
            value = "/shoppingCart/{cartId}/products",
            produces = { "application/json" },
            consumes = { "application/json" }
            )
        default ResponseEntity<ShoppingCartDto> addProductToShoppingCart(
        @Parameter(name = "cartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("cartId") Long cartId,
        @Parameter(name = "AddProductInShoppingCartDto", description = "", required = true) @Valid @RequestBody AddProductInShoppingCartDto addProductInShoppingCartDto
            ) {
            return getDelegate().addProductToShoppingCart(cartId, addProductInShoppingCartDto);
            }


            /**
            * DELETE /shoppingCart/{cartId} : Clear all items from the shopping cart
            *
                * @param cartId  (required)
            * @return Shopping cart cleared successfully (status code 200)
                *         or Invalid shopping cart ID (status code 400)
            */
                @Operation(
                operationId = "clearShoppingCart",
                    summary = "Clear all items from the shopping cart",
                responses = {
                    @ApiResponse(responseCode = "200", description = "Shopping cart cleared successfully", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = ShoppingCartDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Invalid shopping cart ID")
                }
                )
            @PreAuthorize("hasAuthority('')")
            @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/shoppingCart/{cartId}",
            produces = { "application/json" }
            )
        default ResponseEntity<ShoppingCartDto> clearShoppingCart(
        @Parameter(name = "cartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("cartId") Long cartId
            ) {
            return getDelegate().clearShoppingCart(cartId);
            }


            /**
            * GET /shoppingCart/{cartId}/products : Get all products in the shopping cart
            *
                * @param cartId  (required)
            * @return Products in the shopping cart (status code 200)
                *         or Invalid shopping cart ID (status code 400)
            */
                @Operation(
                operationId = "getProductsInShoppingCart",
                    summary = "Get all products in the shopping cart",
                responses = {
                    @ApiResponse(responseCode = "200", description = "Products in the shopping cart", content = {
                        @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ProductInShoppingCartDto.class)))
                    }),
                    @ApiResponse(responseCode = "400", description = "Invalid shopping cart ID")
                }
                )
            @PreAuthorize("hasAuthority('')")
            @RequestMapping(
            method = RequestMethod.GET,
            value = "/shoppingCart/{cartId}/products",
            produces = { "application/json" }
            )
        default ResponseEntity<List<ProductInShoppingCartDto>> getProductsInShoppingCart(
        @Parameter(name = "cartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("cartId") Long cartId
            ) {
            return getDelegate().getProductsInShoppingCart(cartId);
            }


            /**
            * GET /shoppingCart/{cartId} : get shopping cart info
            *
                * @param cartId  (required)
            * @return Shopping cart details (status code 200)
            */
                @Operation(
                operationId = "getShoppingCart",
                    summary = "get shopping cart info",
                responses = {
                    @ApiResponse(responseCode = "200", description = "Shopping cart details", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = ShoppingCartDto.class))
                    })
                }
                )
            @PreAuthorize("hasAuthority('')")
            @RequestMapping(
            method = RequestMethod.GET,
            value = "/shoppingCart/{cartId}",
            produces = { "application/json" }
            )
        default ResponseEntity<ShoppingCartDto> getShoppingCart(
        @Parameter(name = "cartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("cartId") Long cartId
            ) {
            return getDelegate().getShoppingCart(cartId);
            }


            /**
            * DELETE /shoppingCart/{cartId}/products/{productInCartId} : Remove a product from the shopping cart
            *
                * @param cartId  (required)
                * @param productInCartId  (required)
            * @return Product removed successfully (status code 200)
                *         or Invalid product or shopping cart ID (status code 400)
            */
                @Operation(
                operationId = "removeProductFromShoppingCart",
                    summary = "Remove a product from the shopping cart",
                responses = {
                    @ApiResponse(responseCode = "200", description = "Product removed successfully", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = ShoppingCartDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Invalid product or shopping cart ID")
                }
                )
            @PreAuthorize("hasAuthority('')")
            @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/shoppingCart/{cartId}/products/{productInCartId}",
            produces = { "application/json" }
            )
        default ResponseEntity<ShoppingCartDto> removeProductFromShoppingCart(
        @Parameter(name = "cartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("cartId") Long cartId,
        @Parameter(name = "productInCartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("productInCartId") Long productInCartId
            ) {
            return getDelegate().removeProductFromShoppingCart(cartId, productInCartId);
            }


            /**
            * PATCH /shoppingCart/{cartId}/products/{productInCartId} : Update the quantity of a product in the shopping cart
            *
                * @param cartId  (required)
                * @param productInCartId  (required)
                * @param updateQuantityOfProductInShoppingCartDto  (required)
            * @return Product quantity updated successfully (status code 200)
                *         or Invalid product data (status code 400)
            */
                @Operation(
                operationId = "updateQuantityOfProductInShoppingCart",
                    summary = "Update the quantity of a product in the shopping cart",
                responses = {
                    @ApiResponse(responseCode = "200", description = "Product quantity updated successfully", content = {
                        @Content(mediaType = "application/json", schema = @Schema(implementation = ShoppingCartDto.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Invalid product data")
                }
                )
            @PreAuthorize("hasAuthority('')")
            @RequestMapping(
            method = RequestMethod.PATCH,
            value = "/shoppingCart/{cartId}/products/{productInCartId}",
            produces = { "application/json" },
            consumes = { "application/json" }
            )
        default ResponseEntity<ShoppingCartDto> updateQuantityOfProductInShoppingCart(
        @Parameter(name = "cartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("cartId") Long cartId,
        @Parameter(name = "productInCartId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("productInCartId") Long productInCartId,
        @Parameter(name = "UpdateQuantityOfProductInShoppingCartDto", description = "", required = true) @Valid @RequestBody UpdateQuantityOfProductInShoppingCartDto updateQuantityOfProductInShoppingCartDto
            ) {
            return getDelegate().updateQuantityOfProductInShoppingCart(cartId, productInCartId, updateQuantityOfProductInShoppingCartDto);
            }

        }
