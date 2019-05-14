import java.util.*;
public class BaseConverter {
    public static void main(String args[]) {
        String number = args[2];
        int base=Integer.parseInt(args[1]);
        int length= number.length();
        if (isNotValid(number,base)) {
            System.out.println("number is not valid");
            return;
        }
        int decimal= getDotProdut(Digit.getDigits(args[2]), getPowers(length,base));
        System.out.println(decimal);
    }
    private static int getDotProdut(List<Integer> digit, List<Integer> powers){
        int dotProduct=0,j=0;
        while(j<digit.size()){
            dotProduct+=digit.get(j)*powers.get(j);
            j++;
        }
        return dotProduct;
    }
    private static List<Integer> getPowers(int length,int base){
        ArrayList<Integer>listOfPowers=new ArrayList<Integer>();
        int i=0;
        while(i<length){
            int power=((int)(Math.pow(base,i)));
            listOfPowers.add(power);
            i++;
        }
        return listOfPowers;
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