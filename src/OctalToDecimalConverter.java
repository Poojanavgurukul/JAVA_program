public class OctalToDecimalConverter {
    public  static void main(String args[]){
        String number=args[0];
        boolean isNotOctal = isNotOctal(number);
        if(isNotOctal){
            System.out.println("number is not octal");
            return;
        }
        int userNumber=Integer.parseInt(args[0]);
        int i=0,decimal=0,remainder,exponent=8;
        while(userNumber !=0){
            remainder= getRemainder(userNumber);
                userNumber = getQuoitent(userNumber);
                decimal += remainder * ((int) (Math.pow(exponent, i)));
                i++;
        }
        System.out.println(decimal);

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
