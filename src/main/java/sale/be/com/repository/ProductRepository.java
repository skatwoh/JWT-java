package sale.be.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sale.be.com.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}