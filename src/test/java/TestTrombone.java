import Instruments.Brass.Trombone;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTrombone {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone("Trombone", "Brass", "Brass", InstrumentType.BRASS, "Mendini", "Bass");
    }

    @Test
    public void canGetName(){
        assertEquals("Trombone", trombone.getName());
    }

    @Test
    public void canSetName(){
        trombone.setName("Trambane");
        assertEquals("Trambane", trombone.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", trombone.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        trombone.setMaterial("Steel");
        assertEquals("Steel", trombone.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Brass", trombone.getColour());
    }

    @Test
    public void canSetColour(){
        trombone.setColour("Hot Pink");
        assertEquals("Hot Pink", trombone.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Brass", trombone.getType());
    }

    @Test
    public void canSetType(){
        trombone.setType(InstrumentType.KEYED);
        assertEquals("Keyed", trombone.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Mendini", trombone.getMake());
    }

    @Test
    public void canSetMake(){
        trombone.setMake("Houdini");
        assertEquals("Houdini", trombone.getMake());
    }

    @Test
    public void canGetTone(){
        assertEquals("Bass", trombone.getTone());
    }

    @Test
    public void canSetTone(){
        trombone.setTone("Tenor");
        assertEquals("Tenor", trombone.getTone());
    }

    @Test
    public void canPlay(){
        assertEquals("Brrrap!", trombone.play());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(0, trombone.getBoughtPrice(), 0.01);
    }

    @Test
    public void canSetBoughtPrice(){
        trombone.setBoughtPrice(150);
        assertEquals(150, trombone.getBoughtPrice(), 0.01);
    }
}
