import java.util.Scanner;

public class TotalSumOnTheBoundariesAndDiagonal {
    public static void totalSum(int[][] arr) {
		int N = arr.length;
		int requiredSum = 0;
         
        // Traverse arr[][]
        // Loop from i to N-1 for rows
        for (int i = 0; i < N; i++) {
     
            // Loop from j = N-1 for columns
            for (int j = 0; j < N; j++) {
     
                // Condition for diagonal
                // elements
                if (i == j || (i + j) == N - 1) {
                    requiredSum += arr[i][j];
                }
     
                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += arr[i][j];
                }
            }
        }
     
        // Print the final Sum
        System.out.println(requiredSum);
	}

    public static void main(String[] args) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            totalSum(ar);
            sr.close();
        }
    }
}
