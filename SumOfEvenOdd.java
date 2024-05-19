import java.util.Scanner;

/**
 * SumOfEvenOdd
 */
public class SumOfEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int even = 0;
        int odd = 0;
        while(n > 0){
            rem = n%10;
            if(rem %2 == 0){
                even = even + rem;
            }
            else{
                odd = odd + rem;
            }
            n = n/10;
        }
        System.out.print(even + " " + odd);
        sc.close();
    }
}