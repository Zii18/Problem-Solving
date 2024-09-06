import java.util.Scanner;

public class Problem9 {
    public static void main(String[] agrs){
        int N;
        int X;
        int i;
        Scanner scn = new Scanner(System.in);
        System.out.println("ENter number of elemtns");
        N = scn.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i<N;i++) {
            A[i]= scn.nextInt();
        }
        System.out.println("Find below number in array");
        X = scn.nextInt();
        boolean found = false;
        int position = -1;
        for (i=0; i< N; i++) {
            if (A[i] == X) {
                found = true;
                position = i;
                break;
            }
        }
        if (found) {
            System.out.println("Found position: " + position);
        } else {
            System.out.println("No Data");
        }
        scn.close();
            }

        }
