package Lab5.stock;

public class Furniture extends Item{
    private String material;

    public Furniture(String name, String description,String material) {
        super(name, description);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
