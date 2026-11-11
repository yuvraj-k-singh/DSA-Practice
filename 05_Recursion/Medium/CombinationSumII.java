/*
WAP: Combination Sum II
Time Complexity: O(2^n x K)
Space Complexity: O(N)
Date: 11-nov-2026
*/

import java.util.*;

public class CombinationSumII{
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> ans = cSum(nums, target);

        System.out.println("Answer: ");
        for(List<Integer> li: ans){
            for(int x: li){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> cSum(int[] nums, int k){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        combination(0, nums, k, new ArrayList<>(), list);
        return list;
    }

    private static void combination(int start, int[] nums, int k, ArrayList<Integer> ans, List<List<Integer>> list){
        if(k == 0){
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            if(nums[i] > k) break;

            ans.add(nums[i]);
            combination(i+1, nums, k-nums[i], ans, list);
            ans.remove(ans.size()-1);
        }
    }
}
