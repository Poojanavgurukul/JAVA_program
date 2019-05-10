import java.util.*;
public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String numberArray = args[0];
        int length= numberArray.length();
        if (isNotOctal(numberArray)) {
            System.out.println("number is not octal");
            return;
        }
        int decimal = 0;
        decimal=getDotProduts(getDigit(args[0]),getPowersOfEight(length));
        System.out.println(decimal);
    }

    private static List<Integer> getDigit(String Number) {
        int userNumber=Integer.parseInt(Number);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (userNumber != 0) {
            int remainder = getRemainder(userNumber);
            userNumber = getQuoitent(userNumber);
            list.add(remainder);
        }
        return list;
    }
    private static int getDotProduts(List<Integer> digit,List<Integer> powersOfEight){
        int dotProducts=0;
        for (int i = 0; i <digit.size() ; i++) {
            dotProducts+=digit.get(i)*powersOfEight.get(i);
        }
        return dotProducts;
    }
    private static List<Integer>getPowersOfEight(int length){
        ArrayList<Integer>listOfPowersOfEight=new ArrayList<Integer>();
        int i=0,exponent=8;
        while(i<length){
            int power=((int)(Math.pow(exponent,i)));
            listOfPowersOfEight.add(power);
            i++;
        }
        return listOfPowersOfEight;
    }

    private static boolean isNotOctal(String number) {
        return number.contains("8")||number.contains("9");
    }

    private static int getQuoitent(int number) {
        return number/10;
    }

    private static int getRemainder(int number) {
        return number%10;
    }
}