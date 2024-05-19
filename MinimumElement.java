import java.util.Scanner;

public class MinimumElement {
    public static int minimum_element(int[] arr){
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            System.out.println(minimum_element(arr));
            sr.close();
    }
}
