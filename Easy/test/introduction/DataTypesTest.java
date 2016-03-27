package introduction;

import introduction.DataTypes;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by artoves on 15/11/15.
 */
public class DataTypesTest {
    @Test
    public void testShowDataTypes1() {
        long a = Long.valueOf((long) Math.pow(2, 63)) + Long.valueOf(new Long(1));
        long b = Long.valueOf((long) Math.pow(2, 63));
        DataTypes dataTypes = new DataTypes();
        assertEquals("-150 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long", dataTypes.showDataTypes(a, b, -150));
    }

    @Test
    public void testShowDataTypes2() {
        long a = Long.valueOf((long) Math.pow(2, 63)) + Long.valueOf(new Long(1));
        long b = Long.valueOf((long) Math.pow(2, 63));
        DataTypes dataTypes = new DataTypes();
        assertEquals("150000 can be fitted in:\n" +
                "* int\n" +
                "* long", dataTypes.showDataTypes(a, b, 150000));
    }

    @Test
    public void testShowDataTypes3() {
        long a = Long.valueOf((long) Math.pow(2, 63)) + Long.valueOf(new Long(1));
        long b = Long.valueOf((long) Math.pow(2, 63));
        DataTypes dataTypes = new DataTypes();
        assertEquals("1500000000 can be fitted in:\n" +
                "* int\n" +
                "* long", dataTypes.showDataTypes(a, b, 1500000000));
    }

    @Test(expected = Exception.class)
    public void testShowDataTypes4() {
        long a = Long.valueOf((long) Math.pow(2, 63)) + Long.valueOf(new Long(1));
        long b = Long.valueOf((long) Math.pow(2, 63));
        long x = Long.parseLong("213333333333333333333333333333333333");
        DataTypes dataTypes = new DataTypes();
        assertEquals("213333333333333333333333333333333333 can't be fitted anywhere.", dataTypes.showDataTypes(a,b,x));
    }

    @Test
    public void testShowDataTypes5() {
        long a = Long.valueOf((long) Math.pow(2, 63)) + Long.valueOf(new Long(1));
        long b = Long.valueOf((long) Math.pow(2, 63));
        long x = Long.parseLong("-100000000000000");
        DataTypes dataTypes = new DataTypes();
        assertEquals("-100000000000000 can be fitted in:\n" +
                "* long", dataTypes.showDataTypes(a, b, x));
    }
}