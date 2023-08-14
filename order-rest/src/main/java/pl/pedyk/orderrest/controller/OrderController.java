package pl.pedyk.orderrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pedyk.orderrest.model.OrderItem;
import pl.pedyk.orderrest.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<OrderItem> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public OrderItem createOrder(@RequestBody OrderItem orderItem) {
        return orderRepository.save(orderItem);
    }

}

