// represents different nen categories
public class NenType {
    // fields
    private String name;
    private String waterEffect;
 
    // constructor - initializes fields
    public NenType(String name, String waterEffect) {
        this.name = name;
        this.waterEffect = waterEffect;
    }

    // getters - returns field values
    public String getName() {
        return name;
    }

    public String getWaterEffect() {
        return waterEffect;
    }

    // we must override the toString method
    // before returning the values
    @Override
    public String toString() {
        return getName() + " " + getWaterEffect();    
    }
}