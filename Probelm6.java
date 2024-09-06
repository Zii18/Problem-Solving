import javax.swing.*;
import java.util.Scanner;

public class Probelm6 {
    public static void main(String[] agrs){
        int end;
        boolean even = false;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        end = scn.nextInt();
        for (int i=1; i<=end; i++){
            if (i % 2 ==0){ even = true;}
            if (even){
                System.out.print(i + " ");
                    even = false;
            }
        }
        scn.close();
    }
}
