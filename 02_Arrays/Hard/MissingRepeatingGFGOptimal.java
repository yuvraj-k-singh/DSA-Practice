/*
WAP: Missing Repeating GFG Optimal Soln
Time Complexity: O(N)
Space Complexity: O(1)
Date: 04-july-2026
*/

import java.util.ArrayList;

public class MissingRepeatingGFGOptimal {
    public static void main(String[] args){
        int[] nums = {4, 3, 6, 2, 1, 1};

        ArrayList<Integer> ans = missingRepeatingGFG(nums);

        System.out.print("Repeating and missing num are : "+ans);
    }

    public static ArrayList<Integer> missingRepeatingGFG(int[] nums){
        long n = nums.length;
        long sum = 0, sqSum = 0;
        long Sn = n*(n+1)/2;
        long S2n = (n*(n+1)*(2*n+1))/6;

        for(int x: nums){
            sum += (long)x;
            sqSum += (long)x*x;
        }

        long val1 = sum-Sn;
        long val2 = sqSum-S2n;
        val2 = val2/val1;

        long repeating = (val1+val2)/2;
        long missing = (repeating - val1);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int)repeating);
        ans.add((int)missing);
        return ans;
    }
}
