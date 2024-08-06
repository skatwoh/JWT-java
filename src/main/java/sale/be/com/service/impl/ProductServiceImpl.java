package sale.be.com.service.impl;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale.be.com.model.Product;
import sale.be.com.repository.ProductRepository;
import sale.be.com.service.iService.IProductService;
import sale.be.com.util.PagedResponse;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public PagedResponse<Product> getProduct(int page, int size) throws ServiceException {
        return null;
    }

    @Override
    public List<Product> getListAllProduct() throws ServiceException {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductBySearch(String search) throws ServiceException {
        return productRepository.findAll().stream().filter(product -> product.getName().contains(search) || product.getCode().contains(search)).toList();
    }

}
