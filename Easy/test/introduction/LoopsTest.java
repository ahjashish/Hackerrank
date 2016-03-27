package introduction;

import introduction.Loops;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by artoves on 15/11/15.
 */
public class LoopsTest {
    @Test
    public void testSeries1(){
        Loops loops = new Loops();
        assertEquals("2 6 14 30 62 126 254 510 1022 2046",loops.series(0,2,10));
    }
    @Test
    public void testSeries2(){
        Loops loops = new Loops();
        assertEquals("8 14 26 50 98",loops.series(5,3,5));
    }
}
