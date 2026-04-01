/*
WAP: Kth Pair Difference
Time Complexity: O(n)
Space Complexity: O(n)
Date: 01-apr-2026
*/

import java.util.HashSet;

public class KthPairDifference {
    public static void main(String[] args){
        int[] arr = {1,3,1,5,4};
        int target = 0;

        int count = kthDifference(arr, target);

        System.out.println("The total pair is: "+count);
    }

    private static int kthDifference(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int x : arr){
            int rem = Math.abs(target - x);
            if(set.contains(rem)) count++;
            set.add(x);
        }
        return count;
    }
}
