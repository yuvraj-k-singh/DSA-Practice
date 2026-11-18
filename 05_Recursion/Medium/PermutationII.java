/*
WAP: PermutationII
Time Complexity: O(N! x N)
Space Complexity: O(N x K)
Date: 17-nov-2026
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> ans = permutation(nums);

        System.out.println("Answer: ");
        for(List<Integer> list: ans){
            for(int x: list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        generate(0, nums, list);
        return list;
    }

    private static void generate(int start, int[] nums, List<List<Integer>> list){
        if(start >= nums.length){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int x: nums) ans.add(x);
            list.add(new ArrayList<>(ans));
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=start; i<nums.length; i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);

            swap(nums, i, start);
            generate(start+1, nums, list);
            swap(nums, i, start);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
