package Instruments.Brass;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class Brass extends Instrument {

    private String tone;

    public Brass(String name, String material, String colour, InstrumentType type, String make, String tone) {
        super(name, material, colour, type, make);
        this.tone = tone;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public String play(){
        return "Brrrap!";
    }

}
