import Instruments.Brass.Trombone;
import Instruments.Instrument;
import Instruments.InstrumentType;
import Instruments.Keyed.Piano;
import Instruments.Percussion.Timpani;
import Instruments.Stringed.Guitar;
import Instruments.Woodwind.Oboe;
import Shop.Shop;
import Shop.StockItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {

    Shop shop;
    StockItem stockitem;
    Instrument instrument;
    Instrument piano;
    Instrument guitar;
    Instrument oboe;
    Instrument trombone;
    Instrument timpani;


    @Before
    public void before(){
        guitar = new Guitar("Les Paul", "Mahogany", "Blue Sunburst", InstrumentType.STRINGED, "Gibson", "Electric");
        oboe = new Oboe("Oboe", "African Blackwood", "Black", InstrumentType.WOODWIND, "Yamaha");
        piano = new Piano("Upright Piano", "Spruce", "Natural", InstrumentType.KEYED, "Bösendorfer");
        timpani = new Timpani("Timpani", "Copper", "Copper", InstrumentType.PERCUSSION, "Yamaha");
        trombone = new Trombone("Trombone", "Brass", "Brass", InstrumentType.BRASS, "Mendini", "Bass");
        shop = new Shop();
        stockitem = new StockItem(instrument);
    }

    @Test
    public void canGetStock(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canGetStringedStock(){
        assertEquals(0, shop.getStringedStock());
    }

    @Test
    public void canGetWoodwindStock(){
        assertEquals(0, shop.getWoodwindStock());
    }

    @Test
    public void canGetKeyedStock(){
        assertEquals(0, shop.getKeyedStock());
    }

    @Test
    public void canGetPercussionStock(){
        assertEquals(0, shop.getPercussionStock());
    }

    @Test
    public void canGetBrassStock(){
        assertEquals(0, shop.getBrassStock());
    }

    @Test
    public void canAddStockItem(){
        StockItem newStockItem = new StockItem(piano);
        shop.addItemToStock(newStockItem);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveStockItem(){
        StockItem newStockItem = new StockItem(piano);
        shop.addItemToStock(newStockItem);
        assertEquals(1, shop.getStock());

        shop.removeItemFromStock(newStockItem);
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canPopulateStockLists(){
        StockItem newStockItem1 = new StockItem(piano);
        shop.addItemToStock(newStockItem1);
        StockItem newStockItem2 = new StockItem(guitar);
        shop.addItemToStock(newStockItem2);
        StockItem newStockItem3 = new StockItem(trombone);
        shop.addItemToStock(newStockItem3);
        StockItem newStockItem4 = new StockItem(timpani);
        shop.addItemToStock(newStockItem4);
        StockItem newStockItem5 = new StockItem(oboe);
        shop.addItemToStock(newStockItem5);
        shop.populateStockLists();
        assertEquals(1, shop.getBrassStock());
        assertEquals(1, shop.getPercussionStock());
        assertEquals(1, shop.getStringedStock());
        assertEquals(1, shop.getWoodwindStock());
        assertEquals(1, shop.getKeyedStock());
    }

    @Test
    public void canCalculateTotalProfit(){
        StockItem newStockItem1 = new StockItem(piano);
        newStockItem1.getInstrument().setBoughtPrice(150);
        shop.addItemToStock(newStockItem1);

        StockItem newStockItem2 = new StockItem(guitar);
        newStockItem2.getInstrument().setBoughtPrice(150);
        shop.addItemToStock(newStockItem2);

        StockItem newStockItem3 = new StockItem(trombone);
        newStockItem3.getInstrument().setBoughtPrice(150);
        shop.addItemToStock(newStockItem3);

        StockItem newStockItem4 = new StockItem(timpani);
        newStockItem4.getInstrument().setBoughtPrice(150);
        shop.addItemToStock(newStockItem4);

        StockItem newStockItem5 = new StockItem(oboe);
        newStockItem5.getInstrument().setBoughtPrice(150);
        shop.addItemToStock(newStockItem5);

        assertEquals(225.00, shop.calculateTotalProfit(), 0.01);
    }

}
