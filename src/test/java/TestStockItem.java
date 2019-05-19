import Instruments.Brass.Trombone;
import Instruments.Instrument;
import Instruments.InstrumentType;
import Instruments.Stringed.Guitar;
import Shop.StockItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStockItem {

    StockItem stockitem;
    Instrument instrument;

    @Before
    public void before(){
        instrument = new Trombone("Trombone", "Brass", "Brass", InstrumentType.BRASS, "Mendini", "Bass");
        stockitem = new StockItem(instrument);
    }

    @Test
    public void canGetInstrument(){
        assertEquals(instrument, stockitem.getInstrument());
    }

    @Test
    public void canSetInstrument(){
        Instrument testInstrument = new Guitar("Les Paul", "Mahogany", "Blue Sunburst", InstrumentType.STRINGED, "Gibson", "Electric");
        stockitem.setInstrument(testInstrument);
        assertEquals(testInstrument, stockitem.getInstrument());
    }

    @Test
    public void canGetAndSetDescription(){
        stockitem.setDescription();
        assertEquals("Mendini Trombone Brass", stockitem.getDescription());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0, stockitem.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkup(){
        stockitem.getInstrument().setBoughtPrice(150);
        assertEquals(45.00, stockitem.getMarkup(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        stockitem.getInstrument().setBoughtPrice(150);
        stockitem.setSellPriceWithMarkup();
        assertEquals(195.00, stockitem.getSellPrice(), 0.01);
    }
}
