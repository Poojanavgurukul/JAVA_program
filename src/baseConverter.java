import java.util.*;
public class baseConverter {
    public static void main(String args[]) {
        String number = args[2];
        int base=Integer.parseInt(args[1]);
        int length= number.length();
        if (isNotOctal(number)) {
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
    private static List<Integer> getPowers(int length,int exponent){
        ArrayList<Integer>listOfPowers=new ArrayList<Integer>();
        int i=0;
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