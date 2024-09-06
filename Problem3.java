import java.util.Scanner;

public class Problem3 {
    public static void main(String[] agrs){
        int result =0;
        Scanner scn = new Scanner(System.in);
        System.out.println("PLease enter a first number");
        int x = scn.nextInt();
        System.out.println("Please enter a second number");
        int j = scn.nextInt();
        for (int i = x; i<=j; i++){
        result += i;}
        System.out.println("Solution = " + result);
    }
}
