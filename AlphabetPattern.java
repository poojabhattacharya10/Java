import java.util.Scanner;

/**
 * AlphabetPattern
 */
public class AlphabetPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n){
			int j = 1;
			while(j <= n){
				char ichar = (char)('A'+i-1);
				System.out.print(ichar);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
        sc.close();
    }
}