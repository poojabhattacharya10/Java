import java.util.Scanner;

public class ReverseCharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = n;
		while(i >= 1){
			int j = n;
			while(j >= i){
				char ichar = (char)('A'+j-1);
				System.out.print(ichar);
				j=j-1;
			}
			System.out.println();
			i=i-1;
		}
        sc.close();
    }
}
