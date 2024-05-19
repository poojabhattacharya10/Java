import java.util.Scanner;

public class HourGlassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=i-1){
				System.out.print(" ");
                j++;
			}
			int k=i;
			while(k<=n){
				System.out.print(k +" ");
				k++;
            }
			System.out.println();
			i++;
		}

        // for loop for printing lower half 
        for (i = n-1; i >= 1; i--)  
        { 
            // printing i spaces at the 
            // beginning of each row 
            for (int k = 1; k < i; k++)  
                System.out.print(" "); 
              
            // printing i to rows value 
            // at the end of each row 
            for (int j = i; j <= n; j++)  
                System.out.print(j+" ");  
      
            System.out.println(); 
        }
        sc.close();
    }
}
