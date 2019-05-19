package Instruments.Stringed;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class Stringed extends Instrument {

    private String tone;

    public Stringed(String name, String material, String colour, InstrumentType type, String make, String tone) {
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
        return "Twang!";
    }
}
