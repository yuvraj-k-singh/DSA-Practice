/*
WAP: SubSet II Optimal
Time Complexity: O(N*2^n)
Space Complexity: O(N)
Date: 17-oct-2026
*/

import java.util.*;

public class SubSetTwoOptimal {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subset(nums);
        System.out.println("SubSet: "+ans);
    }

    public static List<List<Integer>> subset(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        powerSet(0, nums, new ArrayList<>(), ans);
        return new ArrayList<>(ans);
    }

    private static void powerSet(int i, int[] nums, ArrayList<Integer> temp, Set<List<Integer>> ans){
        if(i >= nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        powerSet(i+1, nums, temp, ans);
        temp.remove(temp.size()-1);
        powerSet(i+1, nums, temp, ans);
    }
}
