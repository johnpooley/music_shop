import OtherSaleItems.SheetMusic;
import instruments.Synth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetmusic;
    Synth synth;


    @Before
    public void before(){
        synth = new Synth(10,5,12,"black");
        sheetmusic = new SheetMusic("Nirvana songs",1994,synth,2,8);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Nirvana songs", sheetmusic.getTitle());
        assertEquals(1994,sheetmusic.getYear());
        assertEquals(synth,sheetmusic.getInstrument());
        assertEquals(2,sheetmusic.getWholesale());
        assertEquals(8,sheetmusic.getRetail(), 0.01);
    }

    @Test
    public void markupWorks(){
        assertEquals(6,sheetmusic.calculateMarkup(),0.01);
    }
}
