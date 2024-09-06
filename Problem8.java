import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] agrs){
        int oddnum = 0;
        int evennum = 0;
        int posnum = 0;
        int negnum = 0;
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number and 0 when completed");
        while (true) {
            num = scn.nextInt();
            if (num == 30) {
                break;}
            if (num > 0) {
                posnum++;}
            else if (num != 0){negnum++;}

            if (num % 2 ==0){
                evennum++;}
            else{oddnum++;}
        }
        System.out.println("Even Numbers Entered " + evennum);
        System.out.println("Odd Numbers Entered " + oddnum);
        System.out.println("Positive Numbers ENtered " + posnum);
        System.out.println("Neagative Numbers Entered " + negnum);
        scn.close();
        }
    }