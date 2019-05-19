import Instruments.InstrumentType;
import Instruments.Percussion.Timpani;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTimpani {

    Timpani timpani;

    @Before
    public void before(){
        timpani = new Timpani("Timpani", "Copper", "Copper", InstrumentType.PERCUSSION, "Yamaha");
    }

    @Test
    public void canGetName(){
        assertEquals("Timpani", timpani.getName());
    }

    @Test
    public void canSetName(){
        timpani.setName("Tompini");
        assertEquals("Tompini", timpani.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Copper", timpani.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        timpani.setMaterial("Lead");
        assertEquals("Lead", timpani.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Copper", timpani.getColour());
    }

    @Test
    public void canSetColour(){
        timpani.setColour("Banana Yellow");
        assertEquals("Banana Yellow", timpani.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Percussion", timpani.getType());
    }

    @Test
    public void canSetType(){
        timpani.setType(InstrumentType.BRASS);
        assertEquals("Brass", timpani.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Yamaha", timpani.getMake());
    }

    @Test
    public void canSetMake(){
        timpani.setMake("Fisher Price");
        assertEquals("Fisher Price", timpani.getMake());
    }

    @Test
    public void canPlay(){
        assertEquals("Bum bum bum!", timpani.play());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(0, timpani.getBoughtPrice(), 0.01);
    }

    @Test
    public void canSetBoughtPrice(){
        timpani.setBoughtPrice(150);
        assertEquals(150, timpani.getBoughtPrice(), 0.01);
    }

}
