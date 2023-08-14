package pl.pedyk.orderrest.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    @ElementCollection
    private List<Long> orderedProductIds;
    private LocalDateTime orderDate;
    private BigDecimal totalPrice;
}
