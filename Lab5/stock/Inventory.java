package Lab5.stock;

public class Inventory {
    private Quantity quantity;
    private Item item;

    public Inventory(Quantity quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    
}
