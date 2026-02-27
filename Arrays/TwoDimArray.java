import java.util.*;
public class TwoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        System.out.println();
        int [][] num = new int[row][colm];
        // input
        // rows
        for(int i=0; i<row; i++){
            // columns
            for(int j=0; j<colm; j++){
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Search element x : ");
        int x = sc.nextInt();
        // output
        for(int i=0; i<row; i++){
            for(int j=0; j<colm; j++){
                // System.out.print(num[i][j] + " ");
                if( x == num[i][j]){
                    System.out.println(i + " " + j);
                }
            }
            System.out.println();
        }
    }
}
