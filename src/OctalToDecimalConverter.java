public class OctalToDecimalConverter {
    public static void main(String args[]) {
        String userNumber = args[0];
        String[] number =userNumber.split("");
        int i=0,decimal=0,exponent=8;
        boolean isOctalNumber=true;
        for (int j =number.length; j>0 ; j--) {
            int octalNumber=Integer.parseInt(number[j-1]);
            if(octalNumber>7){
                isOctalNumber=false;
                System.out.println("number is not octal");
                break;
            }
            else{
                decimal+=octalNumber*((int)(Math.pow(exponent,i)));
            }
            i++;
        }
        if(isOctalNumber==true){
            System.out.println(decimal);
        }

    }
}
