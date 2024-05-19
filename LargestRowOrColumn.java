import java.util.Scanner;

public class LargestRowOrColumn {
    public static void findLargest(int input[][]){
		//Your code goes here
        int n=input.length;
         if (input.length == 0 || input[0].length == 0) {
            System.out.println("row 0 -2147483648");
            return;
        }
        int m=input[0].length;
        int max = Integer.MIN_VALUE;
        int q = 0;
        int sum=0;
        String s = "";
        // int a[]=new int [m+n];
        //for row sum
        for(int i=0; i<n; i++)
        {
            sum=0;
            for(int j=0; j<m; j++)
            {
            sum =sum +input[i][j];

            }
            if(sum>max){
            max = sum;
            q = i;
            s = "row";
            }
            }
        // for col
        for(int i=0; i<m; i++)
        {
            sum=0;
            for(int j=0; j<n; j++)
            {
            sum=sum+input[j][i];

            }
        if(sum>max){
            max = sum;
            q = i;
            s = "column";
        } 
        }
        System.out.println(s + " "  + q + " " + max);
	}
    public static void main(String[] args) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
		{
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) 
			{
                for (int j = 0; j < m; j++) 
				{
                    ar[i][j] = sr.nextInt();
                }
            }
            findLargest(ar);
            sr.close();
        }
    }
}
