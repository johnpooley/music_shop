import com.sun.swing.internal.plaf.synth.resources.synth;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar=new Guitar(20,6,20, "red");

    }

    @Test
    public void guitarHasValues(){
        assertEquals(20,guitar.getAge());
        assertEquals(6,guitar.getStrings());
        assertEquals(20,guitar.getWholesale());
        assertEquals(50, guitar.getRetail(), 0.01);
        assertEquals("red", guitar.getColour());

    }

    @Test
    public void canPlay(){
        assertEquals("", guitar.playSound());
    }

}
