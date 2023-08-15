package pl.pedyk.orderrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pedyk.orderrest.model.OrderItem;

@Repository
public interface OrderRepository extends JpaRepository<OrderItem, Long> {
}
