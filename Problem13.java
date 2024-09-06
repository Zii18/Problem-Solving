import java.util.Scanner;

public class Problem13 {
    public static void main(String[] agrs) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a;
        a = scn.nextInt();
        System.out.println("Enter a 2nd Number");
        int b;
        b = scn.nextInt();
        System.out.println("Enter a last number");
        int k;
        k = scn.nextInt();

        if ((a % k==0) && (b % k==0)){
            System.out.println("Both");
        }
        if ((a % k==0) && (b % k!=0)){
            System.out.println("Memo");
        }
        if ((a % k!=0) && (b % k==0)){
            System.out.println("Momo");
        }
        if ((a % k!=0) && (b % k!=0)){
            System.out.println("No one");
        }
    }
}
