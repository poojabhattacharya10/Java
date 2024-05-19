/*
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. 
Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81



Problem statement
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.

That is, we can switch from one array to another array only at common elements.

If no intersection element is present, we need to take sum of all elements from the array with greater sum.
 */

import java.util.Scanner;

public class MaximiseTheSum {
    public static long maximumSumPath(int arr1[], int arr2[])
    {
        // Variable to store index of arr1 and arr2
        int i = 0, j = 0 , n=arr1.length , m=arr2.length;

        long currSumArr1 = 0, currSumArr2 = 0, maximumSum = 0;

        // Iterate while i<n and j<m
        while (i < n && j < m)
        {
            /*
            If current element of arr1 is smaller than arr2, increment 'i'
            and add current element currSumArr1
            */
            if (arr1[i] < arr2[j])
            {

                currSumArr1 += arr1[i];
                i++;
            }

            /*
            If current element of arr2 is smaller than arr1, increment 'j'
            and add current element currSumArr2
            */
            else if (arr1[i] > arr2[j])
            {
                currSumArr2 += arr2[j];
                j++;
            }

            // Otherwise, update maximumSum
            else
            {
                maximumSum += Math.max(currSumArr1, currSumArr2);
                maximumSum += arr1[i];
                currSumArr1 = 0;
                currSumArr2 = 0;
                i++;
                j++;
            }
        }

        while (i < n)
        {
            currSumArr1 += arr1[i];
            i++;
        }

        while (j < m)
        {
            currSumArr2 += arr2[j];
            j++;
        }

        maximumSum += Math.max(currSumArr1, currSumArr2);

        return maximumSum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for(int i = 0; i < m; i++) {
        	input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for(int i = 0; i < n; i++) {
        	input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
        s.close();
    }
}
