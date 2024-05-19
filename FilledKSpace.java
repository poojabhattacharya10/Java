import java.util.Scanner;

public class FilledKSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Upper loop
        for(int i = n ; i >= 1 ; i--){
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        // Lower loop
        for(int i = 1 ; i < n ; i++){
            for(int j = i+1 ; j>=1 ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
