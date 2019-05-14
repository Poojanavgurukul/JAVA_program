import java.util.*;
public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String numberArray = args[0];
        int length= numberArray.length();
        if (isNotOctal(numberArray)) {
            System.out.println("number is not octal");
            return;
        }
        int decimal= getDotProdut(getDigits(args[0]), getPowers(length));
        System.out.println(decimal);
    }

    private static List<Integer> getDigits(String Number) {
        String[] userNumber=Number.split("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=userNumber.length;
        while(i>0){
            list.add(Integer.valueOf(userNumber[i-1]));
            i--;
        }
        return list;
    }
    private static int getDotProdut(List<Integer> digit, List<Integer> powers){
        int dotProduct=0,j=0;
        while(j<digit.size()){
            dotProduct+=digit.get(j)*powers.get(j);
            j++;
        }
        return dotProduct;
    }
    private static List<Integer> getPowers(int length){
        ArrayList<Integer>listOfPowers=new ArrayList<Integer>();
        int i=0,exponent=8;
        while(i<length){
            int power=((int)(Math.pow(exponent,i)));
            listOfPowers.add(power);
            i++;
        }
        return listOfPowers;
    }
    private static boolean isNotOctal(String number) {
        return number.contains("8")||number.contains("9");
    }
}