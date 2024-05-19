import java.util.Scanner;

public class Composite {
    public static void print_composite(int n)
    {
        // write your code logic here 
        for(int i = 2 ; i <= n ; i++){
            for(int j = 2; j < i ; j++){
                if(i % j == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print_composite(n);
        sc.close();
    }
}
