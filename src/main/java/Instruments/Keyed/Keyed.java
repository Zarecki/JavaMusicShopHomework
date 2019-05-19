package Instruments.Keyed;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class Keyed extends Instrument {

    public Keyed(String name, String material, String colour, InstrumentType type, String make) {
        super(name, material, colour, type, make);
    }

    public String play(){
        return "Plink!";
    }
}
