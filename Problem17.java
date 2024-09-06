import java.util.Scanner;

public class Problem17 {public static void main(String[] agrs) {
    Scanner scn = new Scanner(System.in);
int a,b;
    System.out.println("Enter Number a");
    a = scn.nextInt();
    System.out.println("ENter Number b");
    b = scn.nextInt();
    if (a % b==0 || b % a==0){
        System.out.println("Multiples");
    } else {
        System.out.println("No Multiples");}
}
}
