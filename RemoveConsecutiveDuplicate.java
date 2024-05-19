import java.util.Scanner;
/**
 *  Input String: "aaaa"
    Expected Output: "a"

    Input String: "aabbbcc"
    Expected Output: "abc"
 */
public class RemoveConsecutiveDuplicate {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String ans = "";
        char ch = str.charAt(0);
        ans = ans + ch;
        int i = 1;
        while(i < str.length()){
            if(ch == str.charAt(i)){
                i++;
            }
            else{
                ch = str.charAt(i);
                ans = ans + ch;
                i++;
            }
        }
        return ans;

	}
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = removeConsecutiveDuplicates(str);;

		System.out.println(ans);
        sr.close();
    }
}
