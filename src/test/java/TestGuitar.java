import Instruments.InstrumentType;
import Instruments.Stringed.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Les Paul", "Mahogany", "Blue Sunburst", InstrumentType.STRINGED, "Gibson", "Electric");
    }

    @Test
    public void canGetName(){
        assertEquals("Les Paul", guitar.getName());
    }

    @Test
    public void canSetName(){
        guitar.setName("Lesley Paul");
        assertEquals("Lesley Paul", guitar.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        guitar.setMaterial("Plywood");
        assertEquals("Plywood", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Blue Sunburst", guitar.getColour());
    }

    @Test
    public void canSetColour(){
        guitar.setColour("Hot Pink");
        assertEquals("Hot Pink", guitar.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Stringed", guitar.getType());
    }

    @Test
    public void canSetType(){
        guitar.setType(InstrumentType.KEYED);
        assertEquals("Keyed", guitar.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void canSetMake(){
        guitar.setMake("Glibson");
        assertEquals("Glibson", guitar.getMake());
    }

    @Test
    public void canGetTone(){
        assertEquals("Electric", guitar.getTone());
    }

    @Test
    public void canSetTone(){
        guitar.setTone("Acoustic Bass");
        assertEquals("Acoustic Bass", guitar.getTone());
    }

    @Test
    public void canPlay(){
        assertEquals("Twang!", guitar.play());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(0, guitar.getBoughtPrice(), 0.01);
    }

    @Test
    public void canSetBoughtPrice(){
        guitar.setBoughtPrice(150);
        assertEquals(150, guitar.getBoughtPrice(), 0.01);
    }

}
