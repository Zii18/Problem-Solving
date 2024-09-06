import java.util.Scanner;

public class Probelm23 {
    public static void main(String[] agrs) {
        System.out.print("Enter age ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int years = x / 365;
        int daysleft = x % 365;
        int months = daysleft / 30;
        int days = daysleft % 30;

        System.out.println( years + " years" + months + " months" + days + " days");

    }
}
