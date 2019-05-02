
public class octal_number {
    public  static void main(String args[]){
        int userNumber = Integer.parseInt(args[0]);
        int i=0,decimal=0,remainder;
        while(userNumber !=0){
            remainder= getRemainder(userNumber);
            System.out.println(remainder);
            userNumber= getQuoitent(userNumber);
            System.out.println(userNumber);
        }
    }
    private static int getQuoitent(int number) {
        return number/10;
    }

    private static int getRemainder(int number) {
        return number%10;
    }
}
