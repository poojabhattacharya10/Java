import java.util.Scanner;

public class MoveZeroesToEnd {
    public static int[] moveZeros(int n, int []a) {
        int count = 0;  // Count of non-zero elements 
  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) 
            if (a[i] != 0){
                a[count++] = a[i]; 
        } 
        // here count is incremented 
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n){
            a[count++] = 0; 
        } 
        return a;
    }
    public static void main(String[] args) {
        // {1,2,0,0,2,3}
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        moveZeros(n , arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
