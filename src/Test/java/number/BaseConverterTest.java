package number;

import baseconverter.Digit;
import baseconverter.DotProduct;
import baseconverter.GetPower;
import baseconverter.SumOfDigit;
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
    @Test public void getDotProduct(){
        List<Integer>expected=Arrays.asList(3,16,64);
        List<Integer>a=Arrays.asList(3,2,1);
        List<Integer>b=Arrays.asList(1,8,64);
        assertEquals(expected, DotProduct.getProduct(a,b));
    }
    @Test public void getSum(){
        int expected=83;
        List<Integer>productList=Arrays.asList(3,16,64);
        assertEquals(expected, SumOfDigit.getTotal(productList));
    }
}
