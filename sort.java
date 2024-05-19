import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        String ip = "MEERUT" ;

        char charArr[] = ip.toCharArray();

        Arrays.sort(charArr);

        String op = new String(charArr);

        System.out.println(ip + " " + op);
    }
}
