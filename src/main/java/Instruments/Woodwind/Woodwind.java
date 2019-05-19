package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class Woodwind extends Instrument {

    public Woodwind(String name, String material, String colour, InstrumentType type, String make) {
        super(name, material, colour, type, make);
    }

    public String play(){
        return "Toot toot!";
    }
}
