public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String userNumber = args[0];
        String[] number =userNumber.split("");
        int i=0;
        for (int j =number.length; j>0 ; j--) {
            System.out.println(number[j-1]);
        }
    }
}
