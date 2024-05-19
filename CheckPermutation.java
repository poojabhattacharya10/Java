import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		boolean result = true;

		// If length of both strings is not same, 
    	// then they cannot be Permutation 
		if(str1.length() != str2.length())
		  result = false;

		else {

			char ch1[]  = str1.toCharArray();
			char ch2[]  = str2.toCharArray();

			// Sort both strings 
			Arrays.sort(ch1);
			Arrays.sort(ch2);


			// Compare sorted strings 
			for(int i = 0 ; i < str1.length() ; i++) {
				if(ch1[i] != ch2[i]) {
					result = false;
					break;
				}
			}
		}

			return result;		
	}

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
		boolean ans = isPermutation(str1, str2);

		System.out.println(ans);
        sr.close();
    }
}
