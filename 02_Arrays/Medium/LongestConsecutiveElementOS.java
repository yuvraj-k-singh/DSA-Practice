/*
WAP: Longest Consecutive Element Optimal Solution
Time Complexity: O(NlogN)
Space Complexity: O(1)
Date: 04-may-2026
*/

import java.util.Arrays;

public class LongestConsecutiveElementOS {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};

        int length = longestConsectiveOS(arr);

        System.out.print("Longest consecutive length is: " +length);
    }

    public static int longestConsectiveOS(int[] arr){
        Arrays.sort(arr);
        int longest = 1, count = 0, lastElem = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]-1 == lastElem){
                count++;
                lastElem = arr[i];
            }else if(arr[i] != lastElem){
                count = 1;
                lastElem = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
