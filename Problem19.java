import java.util.Scanner;

public class Problem19 {
    public static void main(String[] agrs) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = scn.nextInt();
        System.out.println("Enter a Number");
        int b = scn.nextInt();
        System.out.println("Enter a Number");
        int c = scn.nextInt();

        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println( min + " " + max);
        scn.close();
    }

}
