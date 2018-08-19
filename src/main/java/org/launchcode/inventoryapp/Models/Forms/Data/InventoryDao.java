package org.launchcode.inventoryapp.Models.Forms.Data;

import org.launchcode.inventoryapp.Models.Forms.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface InventoryDao extends CrudRepository<Inventory, Integer> {
}
