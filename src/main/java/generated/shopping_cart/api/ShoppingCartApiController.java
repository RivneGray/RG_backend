package generated.shopping_cart.api;

import ua.rivnegray.boardgames_shop.DTO.request.create.MapProductInCartCartDto;
import ua.rivnegray.boardgames_shop.DTO.response.OrderDto;
import ua.rivnegray.boardgames_shop.DTO.response.ProductInShoppingCartDto;
import ua.rivnegray.boardgames_shop.DTO.request.update.UpdateQuantityOfProductInShoppingCartDto;


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
@RequestMapping("${openapi.shoppingCart.base-path:}")
public class ShoppingCartApiController implements ShoppingCartApi {

    private final ShoppingCartApiDelegate delegate;

    public ShoppingCartApiController(@Autowired(required = false) ShoppingCartApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ShoppingCartApiDelegate() {});
    }

    @Override
    public ShoppingCartApiDelegate getDelegate() {
        return delegate;
    }

}
