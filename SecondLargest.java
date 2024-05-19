import java.util.Scanner;

public class SecondLargest {
    public static int secondLargestElement(int[] arr, int n) {
        int max = arr[0];
        int prev = arr[0];
        for(int i = 1 ; i < n ; i++){
            
            if(max < arr[i]){
                prev = max;
                max = arr[i];
                
            }
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
	    int n=sr.nextInt();
	    int ar[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        ar[i]= sr.nextInt();
	    }
	    int ans = secondLargestElement(ar,n);
	    System.out.println(ans);
        sr.close();
    }
}
