import java.util.Scanner;

public class PrintLikeAWave {
    public static void wavePrint(int mat[][]){
		if (mat.length==0)
            return;
        int p = mat[0].length-1;
        for (int j = 0; j < p ; j++)
        {
            for (int i = 0; i < mat.length; i++)
            {
                System.out.print(mat[i][j]+" ");
            }
            j++;
            if (j==mat[0].length)
                return;
            for (int i = mat.length-1; i >= 0; i--)
            {
                System.out.print(mat[i][j]+" ");
            }
        }
	}

    public static void main(String[] args) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            M = sr.nextInt();
            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            wavePrint(ar);
	    System.out.println();
        sr.close();
        }
    }
}
