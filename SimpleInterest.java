import java.util.Scanner;

public class SimpleInterest {
    public static int calculateSimple(int principal, double rate, int time) {
        double si = (principal * rate * time)/100;  
        return ((int)si);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        double rate = sc.nextDouble();
        int time = sc.nextInt();
       System.out.println(calculateSimple(principal, rate, time ));
       sc.close();
    }
}
