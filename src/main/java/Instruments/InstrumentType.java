package Instruments;

public enum InstrumentType {

    PERCUSSION("Percussion"),
    WOODWIND("Woodwind"),
    KEYED("Keyed"),
    STRINGED("Stringed"),
    BRASS("Brass");


    private final String value;

    InstrumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
