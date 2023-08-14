package pl.pedyk.productrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pedyk.productrest.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
