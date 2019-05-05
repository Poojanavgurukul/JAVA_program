public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String userNumber = args[0];
        String[] number =userNumber.split("");
        int i=0,decimal=0,exponent=8;
        for (int j =number.length; j>0 ; j--) {
            int octalNumber=Integer.parseInt(number[j-1]);
            decimal+=octalNumber*((int)(Math.pow(exponent,i)));
            System.out.println(decimal);
            i++;
        }

    }
}
