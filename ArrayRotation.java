import java.util.Scanner;

/*
 * Problem statement
There is an array ‘A’ of size ‘N’.

You are also given an integer ‘X’ and direction ‘DIR’. You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.

You must return the rotated array.

For example:

Input :
A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’

Output :
2 6 1 6

Explanation: Rotate array ‘A’ to the left one time.
[6, 2, 6, 1] => [2, 6, 1, 6]
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N <= 10^5 
1 <= X <= 10^9
‘DIR’ is an element of {‘LEFT’, ‘RIGHT’}
Time Limit: 1 sec
Sample Input 1 :
2
4 1 LEFT
1 2 3 4
6 2 RIGHT
1 2 4 3 5 6 
Sample Output 1 :
2 3 4 1
5 6 1 2 4 3
Explanation Of Sample Input 1 :
For test case one:

Input :
A = [1, 2, 3, 4], X = 1, DIR = ‘LEFT’

Output :
2 3 4 1

Explanation: Rotate array ‘A’ to the left one time.
[1, 2, 3, 4] => [2, 3, 4, 1]

For test case two:

Input :
A = [1, 2, 4, 3, 5, 6], X = 2, DIR = ‘RIGHT’

Output :
5 6 1 2 4 3

Explanation: Rotate array ‘A’ to the right one time.
[1, 2, 4, 3, 5, 6] => [6, 1, 2, 4, 3, 5]
Sample Input 2 :
2
6 3 LEFT
22 8 4 7 5 10
6 2 RIGHT
9 3 1 6 3 9
Sample Output 2 :
7 5 10 22 8 4 
3 9 9 3 1 6 
public class Solution {
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here. 
        
    }
}

*/
public class ArrayRotation {
    public static int[] rotateArray(int []a, int x, String dir) {
        int n = a.length;
        if (x > n) {
            x = x % n;
        }
        if (dir.equals("RIGHT")) {
            x = n - x;
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int j = (i + x) % n;
            res[i] = a[j];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int x = sr.nextInt();
    	    String dir = sr.next();
    	    int ar[] = new int[n];
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    ar = rotateArray(ar,x,dir);
    	    //int index = 0;
    	    for(int i=0;i<n;i++)
    	    {
    	        System.out.print(ar[i]+ " ");
    	    }
    	    System.out.println();
    	
    	    t = t-1;
	    }
        sr.close();
    }
}

/**
 * i = 0, j = (0 + 1) % 4 = 1, res[0] = a[1] = 2
i = 1, j = (1 + 1) % 4 = 2, res[1] = a[2] = 6
i = 2, j = (2 + 1) % 4 = 3, res[2] = a[3] = 1
i = 3, j = (3 + 1) % 4 = 0, res[3] = a[0] = 6
So, the result array res after applying the left rotation is [2, 6, 1, 6].


this is the dryrun of example mentioned in problem A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’


int n = a.length; // n is the length of the input array 'a'
if (x > n) {
    x = x % n; // If X is greater than the length, take the remainder to avoid unnecessary rotations
}
if (dir.equals("RIGHT")) {
    x = n - x; // If the direction is RIGHT, adjust X to simulate a LEFT rotation
}
int[] res = new int[n]; // Create an array to store the result of the rotation
for (int i = 0; i < n; i++) {
    int j = (i + x) % n; // Calculate the new index after rotation
    res[i] = a[j]; // Copy the element from the original array to the result array
}
return res; // Return the rotated array
 */