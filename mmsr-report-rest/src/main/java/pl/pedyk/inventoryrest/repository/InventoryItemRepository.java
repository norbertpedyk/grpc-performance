package pl.pedyk.inventoryrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pedyk.inventoryrest.model.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {
}
