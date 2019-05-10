import java.util.*;
public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String numberArray = args[0];
        int length= numberArray.length();
        if (isNotOctal(numberArray)) {
            System.out.println("number is not octal");
            return;
        }
        int decimal= getDotProdut(getDigits(args[0]),getPowersOfEight(length));
        System.out.println(decimal);
    }

    private static List<Integer> getDigits(String Number) {
        int userNumber=Integer.parseInt(Number);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (userNumber != 0) {
            int remainder = getRemainder(userNumber);
            userNumber = getQuoitent(userNumber);
            list.add(remainder);
        }
        return list;
    }
    private static int getDotProdut(List<Integer> digit, List<Integer> powersOfEight){
        int dotProduct=0,j=0;
        while(j<digit.size()){
            dotProduct+=digit.get(j)*powersOfEight.get(j);
            j++;
        }
        return dotProduct;
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