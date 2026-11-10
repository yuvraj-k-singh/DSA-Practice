/*
WAP: Combination Sum I
Time Complexity: O(2^n x K)
Space Complexity: O(N x K)
Date: 11-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    public static void main() {
        int[] nums = {2,3,6,7};
        int target = 7;

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
        List<List<Integer>> list = new ArrayList<>();
        combination(0, nums, k, new ArrayList<>(), list);
        return list;
    }

    private static void combination(int i, int[] nums, int k, ArrayList<Integer> ans, List<List<Integer>> list){
        if(k == 0){
            list.add(new ArrayList<>(ans));
            return;
        }

        if(i >= nums.length){
            if(k == 0){
                list.add(new ArrayList<>(ans));
            }
            return;
        }

        if(nums[i] <= k){
            ans.add(nums[i]);
            combination(i, nums, k-nums[i], ans, list); //Pick
            ans.remove(ans.size()-1);  //Backtrack
        }
        combination(i+1, nums, k, ans, list); //Not Pick
    }
}
