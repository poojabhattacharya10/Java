import java.util.Scanner;

public class FibonacciMember {
    public static boolean checkMember(int n){
        int a = 0;
        int b = 1;
        while(a < n){
            int c = a + b;
            a = b;
            b = c;
            if(a == n){
                return true;
            }
        }
        return false;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));
        s.close();
    }
}
