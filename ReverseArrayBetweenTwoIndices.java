import java.util.Scanner;

public class ReverseArrayBetweenTwoIndices {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        if (l > r)
        {
            System.out.println( "Invalid k");
            return arr;
        }
     
        // One by one reverse first 
        // and last elements of a[0..k-1]
        for (int i =l; i <= (l+r) / 2; i++)
        {
            // System.out.println(arr[i]+ " " + arr[r+l - i]);
            int tempswap = arr[i]; 
                arr[i] = arr[ l+r-i]; 
                arr[l +r-i] = tempswap;
                             
        } 
        // while(l<r){
        //     int temp = arr[l];
        //     arr[l] = arr[r];
        //     arr[r] = temp;
        //     l++;
        //     r--;
        // }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar[] = new int[n];
    	    int l = sr.nextInt();
    	    int r = sr.nextInt();
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    ar = reverseBetween(n, l, r, ar);
    	    for(int i = 0 ;i < n ;i++)
    	    {
    	        System.out.print(ar[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
        }
        sr.close();
    }
}
