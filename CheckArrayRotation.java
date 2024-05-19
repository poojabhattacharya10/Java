import java.util.Scanner;

public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
        int out=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return out;
    	//Your code goes here
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar[] = new int[n];
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    int ans = arrayRotateCheck(ar);
    	    System.out.println(ans);
    	    t = t-1;
	    }
        sr.close();
    }
}
