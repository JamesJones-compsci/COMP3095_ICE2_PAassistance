// Create this third after inventory repository

package ca.gbc.comp3095.inventoryservice.service;

public interface InventoryService {

     public boolean isInStock(String skuCode, Integer quantity);

}
