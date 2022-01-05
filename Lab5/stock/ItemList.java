package Lab5.stock;

import java.util.Vector;

public class ItemList {
    // private Inventory[] inventories;
    private Vector<Electronic> electronics;
    private Vector<Furniture> furnitures;

    public Vector<Electronic> getElectronics() {
        return electronics;
    }

    public void addElectronics(Electronic electronics) {
        this.electronics.add(electronics);
    }

    public void removeElectronicByIndex(int index) {
        this.electronics.remove(index);
    }
    public Vector<Furniture> getFurnitures() {
        return furnitures;
    }

    public void addFurnitures(Furniture furnitures) {
        this.furnitures.add(furnitures);
    }
    public void removeFurnitureByIndex(int index) {
        this.furnitures.remove(index);
    }

    
}
