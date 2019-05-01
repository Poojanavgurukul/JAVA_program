import  java.util.Scanner;
public class octal_number {
    public  static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);
        int i=0,decimal=0,remainder;
        while(number !=0){
            remainder=number%10;
            System.out.println(remainder);
            number=number/10;


        }
    }
}

