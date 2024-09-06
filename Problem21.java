import java.util.Scanner;

public class Problem21 {
    public static void main(String[] agrs){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char X = scn.next().charAt(0);
        if (X >= 'a' && X <= 'z') {
            char result = (char) (X - 32);
            System.out.println(result);
        }
        else {
            char result = (char) (X + 32);
            System.out.println(result);
        }
        scn.close();
    }
}
