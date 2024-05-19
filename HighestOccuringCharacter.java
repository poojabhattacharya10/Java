import java.util.Scanner;

public class HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
    //     int c1 = 0,c2 = 0,i,j;

	// 	char maxChar = '\0';
	// 	j = 0;
	// 	while( j< str.length()) {
	// 	i = 0;
	// 	do {
	// 		if(str.charAt(i) == str.charAt(j)) {
	// 			c2++;
	// 		}
	// 		i++;
	// 	}while(i < str.length());
	// 	if(c2 > c1) {
	// 		maxChar = str.charAt(j) ;
	// 		c1 = c2;
	// 	}
	// 	c2 = 0;
	// 	j++;
	// }
	// 	return maxChar;

    int n = str.length();
	    int frequency[] = new int[256];
	    int maxFrequency = 0;

	    for (int i = 0; i < n; i++) {
	        frequency[str.charAt(i)]++;
	        maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
	    }

	    char answer = '\0';

	    for (int i = 0; i < n; i++) {
	        if (frequency[str.charAt(i)] == maxFrequency) {
	            answer = str.charAt(i);
	            break;
	        }
	    }

	    return answer;
	}
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char ans = highestOccuringChar(str);
		System.out.println(ans);
        sr.close();
    }
}
