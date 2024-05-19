import java.util.Scanner;

public class LeadersInAnArray {
    public static void leaders(int[] input) {
        int n = input.length;
        // last element of an array is leader by default
        int L = input[n - 1];
        System.out.print(L + " ");
 
        // for finding leaders in other elements of the inputay
        for (int i = n - 2; i >= 0; i--) 
        {
            if (input[i] >= L) 
            {
                L = input[i];
                System.out.print(L + " ");
            }
        }
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);	
        s.close();
    }
}
