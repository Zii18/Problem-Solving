import java.util.Scanner;

public class Problem18 {public static void main(String[] agrs) {
    Scanner scn = new Scanner(System.in);
    String a,b,c,d;
    System.out.println("Enter first name of the first person");
    a = scn.nextLine();
    System.out.println("Enter last name of the first person");
    b = scn.nextLine();
    System.out.println("Enter first name of the second person");
    c = scn.nextLine();
    System.out.println("Enter last name of the second person");
    d = scn.nextLine();

    if (b.equals(d)){
        System.out.println("ARE Brothers");} else {
        System.out.println("Not");
    }
    scn.close();
    }
}
