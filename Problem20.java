import java.util.Scanner;

public class Problem20 {

    public static void main(String[] agrs) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = scn.next();
        char Char = input.charAt(0);
        int asciiValue = (int) Char;
        if (asciiValue >= 48 && asciiValue <= 57) {
            System.out.println("Number");
        }
        if (asciiValue >= 65 && asciiValue <= 90) {
            System.out.println("Alpha");
            System.out.println("IS CAPIAL");
        }
        if (asciiValue >= 97 && asciiValue <= 122) {
            System.out.println("Alpha");
            System.out.println("IS SMALL");
        }

    }
}

