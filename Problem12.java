import java.util.Scanner;

public class Problem12 { public static void main(String[] agrs) {
    float X;
    int P;
    Scanner scn = new Scanner(System.in);
    System.out.println("Please enter the Discount Rate");
    X = scn.nextFloat();
    System.out.println("Please enter the Discount Price");
    P = scn.nextInt();
    float percantag;
    float originalprice;
    percantag = X / 100;
    originalprice = P / (1 - percantag);

    System.out.println(" Original Price is " + originalprice);

    scn.close();
}
}