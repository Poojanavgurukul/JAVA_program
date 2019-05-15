import com.pooja.baseconverter.Digit;
import com.pooja.baseconverter.DotProduct;
import com.pooja.baseconverter.GetPower;
import com.pooja.baseconverter.ParseResult;

public class BaseConverter {
    public static void main(String[] args) {
        ParseResult parse =new ParseResult(args);
        String number = parse.number;
        int base= parse.fromBase;
        int length= number.length();
        if (isNotValid(number,base)) {
            System.out.println("number is not valid");
            return;
        }
        int decimal= DotProduct.getDotProduct(Digit.getDigits(parse.number), GetPower.getPowers(length,base));
        System.out.println(decimal);
    }

    private static boolean isNotValid(String number,int base) {
        for (int digit:Digit.getDigits(number)) {
          if(base<=digit){
              return true;
          }
        }
        return false;
    }
}