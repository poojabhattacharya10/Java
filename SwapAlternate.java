import java.util.Scanner;

/**
 * SwapAlternate
 */
public class SwapAlternate {
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        
        for(int i = 0 ; i< arr.length ; i++){
            if(i == arr.length-1 && i%2==0){
                return;
            }
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i = i+1;
        }
        // return;
        
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n ; i++)
            {
                arr[i]=sr.nextInt();
            }
            swapAlternate(arr);
            for(int i=0; i<n ; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
        sr.close();
    }
}