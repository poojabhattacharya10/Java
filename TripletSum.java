import java.util.Scanner;

public class TripletSum {
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int numberPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        numberPairs++;
                    }
                }
            }
        }
        return numberPairs;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            int x =sr.nextInt();
            System.out.println((findTriplet(arr,x)));
            
            t -= 1;
        }
        sr.close();
    }
}
