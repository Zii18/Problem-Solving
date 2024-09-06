import javax.xml.transform.Result;
import java.awt.geom.Area;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] agrs){
        double R;
        double PI = Math.PI;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number");
        R = scn.nextDouble();
        if (R<=100 && R>=1){
            double Area = PI * Math.pow(R,2);
            String Result = String.format("%.9f",Area);
            System.out.println("Area = " + Result);
        }
        scn.close();
    }
    }
