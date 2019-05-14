import com.pooja.baseconverter.Digit;
import com.pooja.baseconverter.DotProduct;
import com.pooja.baseconverter.GetPower;
import static java.lang.Integer.parseInt;

public class BaseConverter {
    public static void main(String[] args) {
        String number = args[2];
        int base= parseInt(args[1]);
        int length= number.length();
        if (isNotValid(number,base)) {
            System.out.println("number is not valid");
            return;
        }
        int decimal= DotProduct.getDotProduct(Digit.getDigits(args[2]), GetPower.getPowers(length,base));
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