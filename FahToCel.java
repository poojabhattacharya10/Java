import java.util.Scanner;

public class FahToCel {

    public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		// Celsius Value = (5/9)*(Fahrenheit Value - 32)  

        // while((start<=end) && (0 <= start && start <=1000) && (0<=end && end <=1000) && (0<=step && step<=1000)){
		// 	int cel = (5*(start - 32))/9;
		// 	System.out.println(start + "\t" + cel);
		// 	start = start + step;
		// }
        
        for(int fah = start ; fah <= end ; fah++){
            int cel = ((fah-32)*5)/9;
            System.out.println(fah+"\t"+cel);
            fah = fah + (step-1);
        }
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);
        s.close();
    }
}
