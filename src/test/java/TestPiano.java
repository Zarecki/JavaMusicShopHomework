import Instruments.InstrumentType;
import Instruments.Keyed.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Upright Piano", "Spruce", "Natural", InstrumentType.KEYED, "Bösendorfer");
    }

    @Test
    public void canGetName(){
        assertEquals("Upright Piano", piano.getName());
    }

    @Test
    public void canSetName(){
        piano.setName("Grand Piano");
        assertEquals("Grand Piano", piano.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Spruce", piano.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        piano.setMaterial("Sprowse");
        assertEquals("Sprowse", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Natural", piano.getColour());
    }

    @Test
    public void canSetColour(){
        piano.setColour("Banana Yellow");
        assertEquals("Banana Yellow", piano.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Keyed", piano.getType());
    }

    @Test
    public void canSetType(){
        piano.setType(InstrumentType.BRASS);
        assertEquals("Brass", piano.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Bösendorfer", piano.getMake());
    }

    @Test
    public void canSetMake(){
        piano.setMake("Fisher Price");
        assertEquals("Fisher Price", piano.getMake());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink!", piano.play());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(0, piano.getBoughtPrice(), 0.01);
    }

    @Test
    public void canSetBoughtPrice(){
        piano.setBoughtPrice(150);
        assertEquals(150, piano.getBoughtPrice(), 0.01);
    }


}
