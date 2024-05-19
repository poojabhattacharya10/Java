import java.util.Scanner;

public class MinimumLengthWord {
    public static String minLengthWord(String input){
		input=input.trim();//Triming any space before the String else space at start would be consider as smallest word      
        // minWord and maxWord are received by reference 
        // and not by value
        // will be used to store and return output
         
        int len = input.length();
        int si = 0, ei = 0;
        int min_length = len, min_start_index = 0;
 
        // Loop while input string is not empty
        while (ei <= len) 
        {
            if (ei < len && input.charAt(ei) != ' ')
            {
                ei++;
            } 
            else
            {
                // end of a word
                // find curr word length
                int curr_length = ei - si;
 
                if (curr_length < min_length) 
                {
                    min_length = curr_length;
                    min_start_index = si;
                }
                ei++;
                si = ei;
            }
        }
 
        // store minimum and maximum length words
        String minWord = input.substring(min_start_index, min_start_index + min_length);
        return minWord;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
        s.close();
    }
}
