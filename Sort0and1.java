import java.util.Scanner;

public class Sort0and1 {
    public static void sortZeroesAndOne(int[] arr) {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
               count++; 
            }
        }
        for(int j = 0 ; j < count ; j++){
            arr[j] = 0;
        }
        for(int k = count ; k < arr.length ; k++){
            arr[k]=1;
        }
        return;
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
            sortZeroesAndOne(arr);
             for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
           
            t -= 1;
        }
        sr.close();
    }
}
