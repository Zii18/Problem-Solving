import java.util.Scanner;

public class Problem2 {
    public static void main(String[] agrs){
        int Num1;
        int Num2;
        Scanner scn = new Scanner(System.in);
        System.out.println("PLease enter a first number");
        Num1 = scn.nextInt();
        System.out.println("Please enter a second number");
        Num2 = scn.nextInt();
int lastDigit1 = Num1 % 10;
int lastDigit2 = Num2 % 10;
int sum = lastDigit1 + lastDigit2;
        System.out.println("Sumilitaion of last digits is : " + sum);
    }
}
