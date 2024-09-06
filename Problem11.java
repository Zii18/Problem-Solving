import java.util.Scanner;

public class Problem11 {public static void main(String[] agrs) {
    Scanner scn = new Scanner(System.in);
    int maxoper = 0;
    System.out.println("Enter the number of elements in the Array");
    int N = scn.nextInt();
    System.out.println("Enter the elements of the arrays");
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
        A[i] = scn.nextInt();}
    boolean Iseven = true;
    while(Iseven){
        for (int i = 0; i< N; i++){
            if (A[i] %2 !=0){
                Iseven = false;
                break;}
           A[i]/=2;
        }
        if (Iseven){maxoper++;}

    }
   System.out.println(" Max Operations " + maxoper);
    }

}


