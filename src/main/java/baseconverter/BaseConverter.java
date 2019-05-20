package baseconverter;

import java.util.List;

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
        List<Integer> decimal= DotProduct.getProduct(Digit.getDigits(number), GetPower.getPowers(length,base));
        System.out.println(SumOfDigit.getTotal(decimal));
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