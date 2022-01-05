package Lab5.stock;

public class InventoryList {
    private Inventory[] inventories;

    public InventoryList(Inventory[] inventories) {
        this.inventories = inventories;
    }

    public Inventory[] getInventories() {
        return inventories;
    }

    public void setInventories(Inventory[] inventories) {
        this.inventories = inventories;
    }
    
}
