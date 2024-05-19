import java.util.Scanner;

public class Sort012 {
    // public static void sort012(int[] arr){
    // 	//Your code goes here
    //     int count0 = 0;
    //     int count1 = 0;
    //     int count2 = 0;
    //     for(int i = 0 ; i < arr.length ; i++){
    //         if(arr[i] == 0){
    //             count0++;
    //         }
    //         else if(arr[i] == 1){
    //             count1++;
    //         }
    //         else if(arr[i] == 2){
    //             count2++;
    //         }
    //     }
    //     for(int i = 0 ; i < count0 ; i++){
    //         System.out.print("0" + " ");
    //     }
    //     for(int i = 0 ; i < count1 ; i++){
    //         System.out.print("1" + " ");
    //     }
    //     for(int i = 0 ; i < count2 ; i++){
    //         System.out.print("2" + " ");
    //     }    
    // }
    public static void sort012(int[] arr){
        int n = arr.length;
        int l=0;
        int r=n-1;
        int temp; 
        for(int i=0;i<n && i<=r;){
            // current element is 0
            if(arr[i]==0){
                // swap(arr[l],arr[i]);
                temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
                i++;
            }
            // current element is 2
            else if(arr[i]==2){
                // swap(arr[i],arr[r]);
                temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
                r--;
            }
            // current element is 1
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sort012(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
