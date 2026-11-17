/*
WAP: Permutation Best Solution
Time Complexity: O(N! x N)
Space Complexity: O(N)
Date: 11-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class PermutationBest {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permutation(nums);

        System.out.println("Answer: ");
        for(List<Integer> list: ans){
            for(int x: list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutation(0, nums, list);
        return list;
    }

    private static void permutation(int start, int[] nums, List<List<Integer>> list){
        if(start >= nums.length){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int x: nums) ans.add(x);
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=start; i<nums.length; i++){
            swap(nums, i, start);
            permutation(start+1, nums, list);
            swap(nums, i, start);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
