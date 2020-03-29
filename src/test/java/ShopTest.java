import OtherSaleItems.SheetMusic;
import Shop.Shop;
import com.sun.swing.internal.plaf.synth.resources.synth;
import instruments.Synth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    SheetMusic sheetmusic;
    Synth synth;

    @Before
    public void before(){
        shop = new Shop("John's shop");
        sheetmusic = new SheetMusic("songs",2000,synth,2,10);
        synth = new Synth(12,50,100,"white");
    }

    @Test
    public void aShopHasAName(){
        assertEquals("John's shop",shop.getName());
    }

    @Test
    public void aShopHasStock(){
        assertEquals(0, shop.getStock().size());
        shop.addToStock(sheetmusic);
        shop.addToStock(synth);
        assertEquals(2,shop.getStock().size());
    }



}

