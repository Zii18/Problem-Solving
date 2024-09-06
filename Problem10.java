import java.util.Scanner;

public class Problem10 {
    public static void main(String[] agrs) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in the Array");
        int N = scn.nextInt();
        System.out.println("Enter the elemts of the arrays");
        int[] A = new int[N];
        for ( int i = 0; i < N; i++) {
            A[i] = scn.nextInt();}
        int min = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] < min) {
                min = A[i];}
        }
        int count = 0;
        for( int i = 0; i < N; i++) {
            if (A[i] == min) {
                count++;
            }
        }
        if (count % 2 == 1) {
            System.out.println("Lucky");
        }
        else {
            System.out.println("Unlucky");
                    }

                    }
                    }