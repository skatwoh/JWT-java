package sale.be.com.service.iService;

import org.hibernate.service.spi.ServiceException;
import sale.be.com.model.Product;
import sale.be.com.util.PagedResponse;

import java.util.List;

public interface IProductService {

    PagedResponse<Product> getProduct(int page, int size) throws ServiceException;

    List<Product> getListAllProduct() throws ServiceException;

    List<Product> getProductBySearch(String search) throws ServiceException;

}
