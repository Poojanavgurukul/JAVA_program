import java.util.*;
public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String numberArray = args[0];
        if (isNotOctal(numberArray)) {
            System.out.println("number is not octal");
            return;
        }
        int number = Integer.parseInt(args[0]);
        int i=0,decimal = 0, remainder, exponent = 8;
        for(Integer digit :getDigit(number)){
            decimal += digit * ((int) (Math.pow(exponent, i)));
            i++;
        }
        System.out.println(decimal);
    }
    private static List<Integer> getDigit(int userNumber) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (userNumber != 0) {
            int remainder = getRemainder(userNumber);
            userNumber = getQuoitent(userNumber);
            list.add(remainder);
        }
        return list;
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
