import java.util.Scanner;

public class Problem14 {
    public static void main(String[] agrs) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an alphabet");
char currentchar = scn.nextLine().charAt(0);
char nextchar;
if (currentchar == 'z'){
    nextchar = 'a';
} else {
    nextchar =(char) (currentchar + 1);}

        System.out.println(nextchar + "");

        scn.close();
}
        }