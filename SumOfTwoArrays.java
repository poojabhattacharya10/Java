import java.util.Scanner;

public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int ar1[], int ar2[], int output[]) {
        int m=ar1.length-1;
        int n=ar2.length-1;
        int c=0;
        int x=Math.max(m,n)+1;
        while(m>=0 && n>=0){
            int sum=ar1[m]+ar2[n]+c;
            output[x]=sum%10;
            c=sum/10;
            m--;
            n--;
            x--;
        }
        while(m>=0){
            int sum=ar1[m]+c;
            output[x]=sum%10;
            c=sum/10;
            m--;
            x--;
        }
        while(n>=0){
            int sum=ar1[n]+c;
            output[x]=sum%10;
            c=sum/10;
            n--;
            x--;
        }
        output[0]=c;
    	//Your code goes here
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar1[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        ar1[i] = sr.nextInt();
    	    }
    	    int m = sr.nextInt();
    	    int ar2[] = new int[m];
    	    for(int i=0;i<m;i++)
    	    {
    	        ar2[i] = sr.nextInt();
    	    }
    	    
    	    int output[] = new int[Math.max(n,m) + 1]; 
    	    sumOfTwoArrays(ar1, ar2, output);
    	    for(int i = 0 ;i < output.length ;i++)
    	    {
    	        System.out.print(output[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }
        sr.close();
    }
}
