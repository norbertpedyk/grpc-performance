package pl.pedyk.inventoryrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pedyk.inventoryrest.model.InventoryItem;
import pl.pedyk.inventoryrest.repository.InventoryItemRepository;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    @GetMapping
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemRepository.findAll();
    }

    @PostMapping
    public InventoryItem createInventoryItem(@RequestBody InventoryItem item) {
        return inventoryItemRepository.save(item);
    }
}
