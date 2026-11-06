/*
WAP: Subset Sum GFG
Time Complexity: O(2^n)
Space Complexity: O(n)
Date: 06-nov-2026
*/

import java.util.ArrayList;

public class SubsetSumGFG {
    public static void main(String[] args){
        int[] nums = {2,3};
        ArrayList<Integer> ans = subsetSums(nums);
        System.out.println("Answer: "+ans);
    }

    public static ArrayList<Integer> subsetSums(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        pSet(0, nums, 0, list);
        return list;
    }

    public static void pSet(int i, int[] nums, int sum, ArrayList<Integer> list){
        if(i >= nums.length){
            list.add(sum);
            return;
        }

        sum += nums[i];
        pSet(i+1, nums, sum, list);
        sum -= nums[i];
        pSet(i+1, nums, sum, list);
    }
}
