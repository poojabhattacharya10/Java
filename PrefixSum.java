import java.util.Scanner;

public class PrefixSum {
    public static void prefixSum(int[] arr) {
        // int prefixSum[] = new int[arr.length];
        // prefixSum[0] = arr[0];
        // System.out.print(arr[0] + " ");
        // // Adding present element with previous element
        // for (int i = 1; i < arr.length; ++i){
                        
        //     prefixSum[i] = prefixSum[i - 1] + arr[i];
        //     System.out.print(prefixSum[i] + " ");

        // }

        // return;

        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
