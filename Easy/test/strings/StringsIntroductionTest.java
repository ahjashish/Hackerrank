package strings;

import introduction.Loops;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by artoves on 27/03/16.
 */
public class StringsIntroductionTest {
    StringsIntroduction stringsIntroduction = new StringsIntroduction();

    @Test
    public void testCase1() {
        assertEquals("9\nNo\nHello Java", stringsIntroduction.processStrings("hello", "java"));
    }

    @Test
    public void testCase2() {
        assertEquals("11\nNo\nHello World!", stringsIntroduction.processStrings("hello", "world!"));
    }
}
