import java.util.Scanner;

public class Problem22 {
    public static void main(String[] agrs) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int X = scn.nextInt();
        String numberStr = Integer.toString(X);
        char firstDigitChar = numberStr.charAt(0);
        int firstDigit = Character.getNumericValue(firstDigitChar);
        System.out.println(firstDigit);

        if ( firstDigit % 2 ==0 ){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
