import java.util.Scanner;

public class Problem15 {
    public static void main(String[] agrs) {
        int a,b,c,d;
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Number a");
        a = scn.nextInt();
        System.out.println("Enter Number b");
        b = scn.nextInt();
        System.out.println("Enter Number c");
        c = scn.nextInt();
        System.out.println("Enter Number d");
        d = scn.nextInt();

        int difference = ((a * b) - (c * d));

        System.out.println(" The asnwer is " + difference);
        scn.close();

    }
}
