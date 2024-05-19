import java.util.Scanner;

public class Palindrome {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        boolean pal = false;
        int temp = n;
        int rev = 0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n = n/10;
        }
        if(rev == temp){
            pal = true;
        }
        return pal;
    }

	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
        sc.close();
    }   
}
