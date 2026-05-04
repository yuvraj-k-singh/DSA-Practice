/*
WAP: Longest Consecutive Element Better Solution
Time Complexity: O(N)
Space Complexity: O(N)
Date: 04-may-2026
*/

import java.util.HashSet;

public class LongestConsecutiveElement {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        int length = longestConsective(arr);

        System.out.print("Longest consecutive length is: " +length);
    }

    public static int longestConsective(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int longest = 1, count = 0, value = 0;

        for(int i: arr) set.add(i);

        for(int x : set){
            if(!set.contains(x-1)){
                count = 1;
                value = x;
                while (set.contains(value+1)){
                    count++;
                    value++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
