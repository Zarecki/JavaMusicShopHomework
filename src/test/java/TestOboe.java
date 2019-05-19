import Instruments.InstrumentType;
import Instruments.Woodwind.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOboe {

    Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe("Oboe", "African Blackwood", "Black", InstrumentType.WOODWIND, "Yamaha");
    }

    @Test
    public void canGetName(){
        assertEquals("Oboe", oboe.getName());
    }

    @Test
    public void canSetName(){
        oboe.setName("Owbow");
        assertEquals("Owbow", oboe.getName());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("African Blackwood", oboe.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        oboe.setMaterial("Pine");
        assertEquals("Pine", oboe.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", oboe.getColour());
    }

    @Test
    public void canSetColour(){
        oboe.setColour("Banana Yellow");
        assertEquals("Banana Yellow", oboe.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Woodwind", oboe.getType());
    }

    @Test
    public void canSetType(){
        oboe.setType(InstrumentType.KEYED);
        assertEquals("Keyed", oboe.getType());
    }

    @Test
    public void canGetMake(){
        assertEquals("Yamaha", oboe.getMake());
    }

    @Test
    public void canSetMake(){
        oboe.setMake("Kamehameha");
        assertEquals("Kamehameha", oboe.getMake());
    }

    @Test
    public void canPlay(){
        assertEquals("Toot toot!", oboe.play());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(0, oboe.getBoughtPrice(), 0.01);
    }

    @Test
    public void canSetBoughtPrice(){
        oboe.setBoughtPrice(150);
        assertEquals(150, oboe.getBoughtPrice(), 0.01);
    }

}
