import java.sql.SQLOutput;
import  java.util.Scanner;
public class octal_number {
    public  static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNumber = input.nextInt();
        System.out.println("You entered " + userNumber);
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
