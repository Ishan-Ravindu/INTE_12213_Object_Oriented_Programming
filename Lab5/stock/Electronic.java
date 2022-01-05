package Lab5.stock;

public class Electronic extends Item{
    private String powerType;

    public Electronic(String name, String description, String powerType) {
        super(name, description);
        this.powerType = powerType;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }
    
}
