package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class Percussion extends Instrument {

    public Percussion(String name, String material, String colour, InstrumentType type, String make) {
        super(name, material, colour, type, make);
    }

    public String play(){
        return "Bum bum bum!";
    }
}
