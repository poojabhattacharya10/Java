import java.util.Scanner;

public class RotatePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int i = count ; i <= n ; i++){
            for(int j = i ; j <= n ; j++){
                System.out.print(j + " ");
                count++;
            }
            for(int k = 1 ; k <= (i-1) ; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
