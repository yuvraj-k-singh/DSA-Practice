/*
WAP: GFG Distinct Element BF
Time Complexity: O(NlogN)
Space Complexity: O(n)
Date: 01-apr-2026
*/

import java.util.Arrays;

public class GFGDistinctElementBF {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};

        int size = distinctElementBF(arr);

        System.out.println("The total distinct Elements: "+size);
    }

    private static int distinctElementBF(int[] arr) {
        Arrays.sort(arr);
        int count = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]) count++;
        }
        return count;
    }
}
