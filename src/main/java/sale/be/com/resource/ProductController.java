package sale.be.com.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import sale.be.com.model.Product;
import sale.be.com.service.impl.ProductServiceImpl;
import sale.be.com.util.ApiResponse;
import sale.be.com.util.ResponseUtil;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/list-all")
    public ResponseEntity<ApiResponse<List<Product>>> listAll(
            @RequestParam(value = "pageNum") int pageNum,
            @RequestParam(value = "pageSize") int pageSize
    ) {
        try {
            List<Product> products = productService.getListAllProduct();
            return ResponseUtil.success(products);
        } catch (Exception e) {
            return ResponseUtil.error("Error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/search")
    public ResponseEntity<ApiResponse<List<Product>>> search(
            @RequestParam(value = "search") String search
    ) {
        try {
            List<Product> products = productService.getProductBySearch(search);
            return ResponseUtil.success(products);
        } catch (Exception e) {
            return ResponseUtil.error("Error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    
}
