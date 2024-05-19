import java.util.Scanner;

public class ReverseAnArray {
    public static int[] reverseArray(int n, int []arr) {
        int i = 0;
        int j = n-1;
        int temp = 0;
        while(i <= j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(n,arr);
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
