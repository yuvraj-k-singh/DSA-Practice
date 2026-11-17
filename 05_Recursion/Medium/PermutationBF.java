/*
WAP: Permutation BF
Time Complexity: O(N! x N)
Space Complexity: O(N x N)
Date: 17-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class PermutationBF {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permutationBF(nums);

        System.out.println("Answer: ");
        for(List<Integer> list: ans){
            for(int x: list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> permutationBF(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutation(nums, new ArrayList<>(), freq, list);
        return list;
    }

    public static void permutation(int[] nums, ArrayList<Integer> ans, boolean[] freq, List<List<Integer>> list){
        if(ans.size() == nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ans.add(nums[i]);
                permutation(nums, ans, freq, list);
                freq[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }
}
