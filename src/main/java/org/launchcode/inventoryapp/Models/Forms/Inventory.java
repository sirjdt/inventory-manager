package org.launchcode.inventoryapp.Models.Forms;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=30)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String partNumber;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String startingInventory;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String inventoryRecieved;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String inventoryShipped;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String inventoryOnHand;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String minimumRequired;

    public Inventory(String name, String description) {
        this.name = name;
        this.partNumber = partNumber;
        this.startingInventory = startingInventory;
        this.inventoryRecieved = inventoryRecieved;
        this.inventoryShipped = inventoryShipped;
        this.inventoryOnHand = inventoryOnHand;
        this.minimumRequired = minimumRequired;
    }

    public Inventory() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return partNumber;
    }

    public void setDescription(String description) {
        this.partNumber = partNumber;
    }

    public String getStartingInventory() {
        return startingInventory;
    }

    public void setStartingInventory(String startingInventory) {
        this.startingInventory = startingInventory;
    }

    public String getInventoryRecieved() {
        return inventoryRecieved;
    }

    public void setInventoryRecieved(String inventoryRecieved) {
        this.inventoryRecieved = inventoryRecieved;
    }

    public String getInventoryShipped() {
        return inventoryShipped;
    }

    public void setInventoryShipped(String inventoryShipped) {
        this.inventoryShipped = inventoryShipped;
    }

    public String getInventoryOnHand() {
        return inventoryOnHand;
    }

    public void setInventoryOnHand(String inventoryOnHand) {
        this.inventoryOnHand = inventoryOnHand;
    }

    public String getMinimumRequired() {
        return minimumRequired;
    }

    public void setMinimumRequired(String minimumRequired) {
        this.minimumRequired = minimumRequired;
    }


}

