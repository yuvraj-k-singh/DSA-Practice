/*
WAP: SubSet I Optimal
Time Complexity: O(N*2^n)
Space Complexity: O(N)
Date: 17-oct-2026
*/

import java.util.ArrayList;
import java.util.List;

public class SubSetOneOptimal {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subset(nums);
        System.out.println("Subset: "+ans);
    }

    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        powerSet(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void powerSet(int i, int[] nums, ArrayList<Integer> temp, List<List<Integer>> ans){
        if(i >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        powerSet(i+1, nums, temp, ans); //pick
        temp.remove(temp.size()-1); //backtrack
        powerSet(i+1, nums, temp, ans); //skip
    }
}
