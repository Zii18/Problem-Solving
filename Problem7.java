import java.util.Scanner;

public class Problem7 {
    public static void main(String[] agrs){
        int num;
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number then 0 to finish");
        while(true) {
            num = scn.nextInt();
            if (num == 0) {
                break;
            }
            sum+= num;
        }
        scn.close();
        int absolutenumber = Math.abs(sum);
        System.out.println("Absolute sum is " + sum);
    }
}
