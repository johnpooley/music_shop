import instruments.Guitar;
import instruments.Synth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SynthTest {

    Synth synth;

    @Before
    public void before(){
        synth=new Synth(20,6,20, "blue");

    }

    @Test
    public void synthHasValues(){
        assertEquals(20,synth.getAge());
        assertEquals(6,synth.getWholesale());
        assertEquals(20, synth.getRetail(), 0.01);
        assertEquals("blue", synth.getColour());

    }

    @Test
    public void canPlugIn(){
        assertEquals("beep boop!", synth.plugIntoSpeaker());
    }



}
