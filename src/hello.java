public class hello {

    public static void main(String[] args) {

        int base = 3, exponent = 2;

        long result = 1;

        for (;exponent != 0; --exponent)
        {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }
}