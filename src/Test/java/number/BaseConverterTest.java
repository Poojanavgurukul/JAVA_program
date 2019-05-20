package number;

import baseconverter.Digit;
import baseconverter.GetPower;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BaseConverterTest {
    @Test public void getDigits(){
        List<Integer>expected= Arrays.asList(3,2,1);
        assertEquals(expected, Digit.getDigits("123"));
    }
    @Test public void getPowerSeries(){
        List<Integer>expected=Arrays.asList(1,8,64);
        assertEquals(expected, GetPower.getPowers(3,8));
    }
}
