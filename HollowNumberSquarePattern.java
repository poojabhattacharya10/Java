/*
   12345
   1   2
   1   2
   1   2
   12345
 */

import java.util.Scanner;

public class HollowNumberSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i == 1 || i == n){
                    System.out.print(j);
                }
                else if(j == 1){
                    System.out.print("1");
                }
                else if( j == n){
                    System.out.print("2");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
