import java.util.Scanner;

public class Problem16 {public static void main(String[] agrs) {
    Scanner scn = new Scanner(System.in);
    int a,b;
    System.out.println("Enter Number a");
    a = scn.nextInt();
    System.out.println("Enter number b");
    b = scn.nextInt();

    if (a <= b){
        System.out.println("Yes");
    } else {
        System.out.println("No");}

}
}
