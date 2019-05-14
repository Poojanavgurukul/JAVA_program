import java.util.*;
public class BaseConverter {
    public static void main(String args[]) {
        String number = args[2];
        int base=Integer.parseInt(args[1]);
        int length= number.length();
        if (isNotValid(number,base)) {
            System.out.println("number is not octal");
            return;
        }
        int decimal= getDotProdut(getDigits(args[2]), getPowers(length,base));
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
        return number.contains("8")||number.contains("9");
    }
}