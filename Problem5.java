import java.util.Scanner;

public class Problem5 {
    public static void main(String[] agrs){
        int num1;
        int num2;
        int num3;
        int num4;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = scn.nextInt();
        System.out.println("Enter a number");
        num2 = scn.nextInt();
        System.out.println("Enter a number");
        num3 = scn.nextInt();
        System.out.println("Enter a number");
        num4 = scn.nextInt();
        int result = num1 * num2 * num3 * num4;
        int lastDigit = result % 100;
        System.out.println(lastDigit);
        scn.close();
    }
}
