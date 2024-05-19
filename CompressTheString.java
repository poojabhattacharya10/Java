import java.util.Scanner;

public class CompressTheString {
    public static String getCompressedString(String str) {
		// Write your code here
		int i,c = 1;
   		String result = "";
   		for(i = 0;i <str.length() - 1;i++) {
			if(str.charAt(i+1) ==str.charAt(i)) {
			c++;	   
			}
			else {
			if(c != 1)
			result = result +str.charAt(i) + c;
			else
			result = result +str.charAt(i);
			c = 1;
			}
    	}
		if(c != 1)
		result = result +str.charAt(i) + c;
		else
		result = result +str.charAt(i);   
		return result;
	}
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = getCompressedString(str);
		System.out.println(ans);
        sr.close();
    }
}
