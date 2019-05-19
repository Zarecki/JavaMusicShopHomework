package Shop;

import Instruments.Instrument;

public class StockItem{

    private Instrument instrument;
    private String description;
    private double sellPrice;

    public StockItem(Instrument instrument) {
        this.instrument = instrument;
        this.description = description;
        this.sellPrice = 0;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = (instrument.getMake()+ " " + instrument.getName() + " " + instrument.getType());
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPriceWithMarkup() {
        double newSellPrice = (instrument.getBoughtPrice() + getMarkup());
        this.sellPrice = newSellPrice;
    }

    public double getMarkup(){
       double markup = (instrument.getBoughtPrice() * 0.3);
       return markup;
    }
}
