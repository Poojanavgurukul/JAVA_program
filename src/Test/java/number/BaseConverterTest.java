package number;

import baseconverter.Digit;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BaseConverterTest {
    @Test public void getDigits(){
        List<Integer>expected= Arrays.asList(3,2,1);
        assertEquals(expected, Digit.getDigits("123"));
    }
}
