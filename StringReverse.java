import java.util.Scanner;

public class StringReverse {
    public static String stringReverse(char[] arr) {
        String str = "";
        for(int i = arr.length - 1 ; i >= 0 ; i --){
          str = str + arr[i];
        }
        return str;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] arr = text.toCharArray();
        System.out.println(stringReverse(arr));
        sc.close();
    }
}
