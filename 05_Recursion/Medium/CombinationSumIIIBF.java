/*
WAP: Combination Sum III BF
Time Complexity: O(2^9 x N(size))
Space Complexity: O(N x C(no of combination))
Date: 11-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIIIBF {
    public static void main(String[] args){
        int n = 3, k = 7;
        List<List<Integer>> ans = cSum(n, k);

        System.out.println("Answer: ");
        for(List<Integer> li: ans){
            for(int x: li){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> cSum(int n, int k){
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        combination(0, nums, n, k, 0, new ArrayList<>(), list);
        return list;
    }

    private static void combination(int i, int[] nums, int n, int k, int sum, ArrayList<Integer> ans, List<List<Integer>> list){
        if(ans.size() == n){
            if(sum == k){
                list.add(new ArrayList<>(ans));
            }
            return;
        }

        if(i > nums.length-1 || sum > k) return;

        sum += nums[i];
        ans.add(nums[i]);
        combination(i+1, nums, n, k, sum, ans, list);
        sum -= nums[i];
        ans.remove(ans.size()-1);
        combination(i+1, nums, n, k, sum, ans, list);
    }
}
