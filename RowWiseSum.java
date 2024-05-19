import java.util.Scanner;

public class RowWiseSum {
    public static void rowWiseSum(int[][] arr) {
		//Your code goes here
		int rSum,i,j;
	    for(i = 0;i < arr.length;i++) {
			rSum = 0;
			for(j = 0;j < arr[i].length;j++) {
				rSum += arr[i][j];
			}
		System.out.print(rSum + " ");
		}
		System.out.println();
	}
    public static void main(String[] args) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i][j]=sr.nextInt();
                }
            }
            // int ans[]= new int[n*m];
            rowWiseSum(ar);
            sr.close();
        }
    }
}
