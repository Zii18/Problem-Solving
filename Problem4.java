import java.util.Scanner;

public class Problem4 {
    public static void main(String[] agrs){
        int num1;
        int num2;
        Scanner scn = new Scanner(System.in);
        System.out.println("PLease enter a number");
        num1 = scn.nextInt();
        System.out.println("please enter a second number");
        num2 = scn.nextInt();
        int sum = num1 + num2;
        System.out.println( " your answer for addition is " + sum);
        int multiply = num1 * num2;
        System.out.println(" your answer for multiplication is " + multiply );
        double division = (double) num1 / num2;
        System.out.println(" your answer for division is " + division );
        int difference = num1 - num2;
        System.out.println(" your answer for subtraction is " + difference);
        scn.close();
    }
}