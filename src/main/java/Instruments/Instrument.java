package Instruments;

public abstract class Instrument implements IPlay{

    private String name;
    private String material;
    private String colour;
    private InstrumentType type;
    private String make;
    private double boughtPrice;

    public Instrument(String name, String material, String colour, InstrumentType type, String make) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.make = make;
        this.boughtPrice = 0;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type.getValue();
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(int boughtPrice) {
        this.boughtPrice = boughtPrice;
    }
}
