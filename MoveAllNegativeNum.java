import java.util.Scanner;

public class MoveAllNegativeNum {
    public static int[] moveNegative(int a[]) {
        int j = 0, temp; 
        for (int i = 0; i < a.length; i++) { 
            if (a[i] < 0) { 
                if (i != j) { 
                    temp = a[i]; 
                    a[i] = a[j]; 
                    a[j] = temp; 
                } 
                j++; 
            } 
        } 
        return a;
    }
    public static void main(String[] args) {
        // [1, 2, -3, 4, -4, -5]   ---> [-3, -5, -4, 2, 4, 1]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        moveNegative(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
