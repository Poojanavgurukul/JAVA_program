public class OctalToDecimalConverter {
    public  static void main(String args[]){
        int userNumber = Integer.parseInt(args[0]);
        int i=0,decimal=0,remainder,exponent=8;
        boolean isNotDecimal=true;
        while(userNumber !=0){
            remainder= getRemainder(userNumber);
            if(remainder>7){
                isNotDecimal=false;
                System.out.println("number is not octal");
                break;
            }
            else {
                userNumber = getQuoitent(userNumber);
                decimal += remainder * ((int) (Math.pow(exponent, i)));
                i++;
            }
        }
        if (isNotDecimal==true) {
            System.out.println(decimal);
        }
    }
    private static int getQuoitent(int number) {
        return number/10;
    }

    private static int getRemainder(int number) {
        return number%10;
    }
}
