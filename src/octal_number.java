import java.sql.SQLOutput;

public class octal_number {
    public  static void main(String args[]){
        int userNumber = Integer.parseInt(args[0]);
        int i=0,decimal=0,remainder,exponent=8;
        while(userNumber !=0){
            remainder= getRemainder(userNumber);
            userNumber= getQuoitent(userNumber);
            decimal+=remainder*((int)(Math.pow(exponent,i)));
            System.out.println(decimal);
            i++;
        }
    }
    private static int getQuoitent(int number) {
        return number/10;
    }

    private static int getRemainder(int number) {
        return number%10;
    }
}
