import java.util.Scanner;

public class GCD {
    public static int findGCD(int a, int b) {
        // write the logic 
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
       return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();   
        System.out.println(findGCD(num1, num2));
        sc.close();
    }
}
