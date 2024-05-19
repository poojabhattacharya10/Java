import java.util.Scanner;

public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		String result = "";

		for(int i= 0;i < str.length();i++) {
			if(str.charAt(i) == ch)
				continue;
			result += str.charAt(i);
		}

		return result;
		// Your code goes here
	}

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char x = sr.next().charAt(0);
		String ans = removeAllOccurrencesOfChar(str, x);
		System.out.println(ans);
        sr.close();
    }
}
