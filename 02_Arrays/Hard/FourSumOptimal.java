/*
WAP: Four Sum Optimal Sol
Time Complexity: O(N^3)
Space Complexity: O(logN)
Date: 30-june-2026
*/

import java.util.*;

public class FourSumOptimal {
    public static void main(String[] args){
        int[] nums = {2,2,2,2,2};
        int target = 8;

        List<List<Integer>> ans = fourSum(nums, target);

        for(List<Integer> a : ans){
            for(int x: a) System.out.print(x+" ");
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k = j+1, l=n-1;

                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum > target) l--;
                    else if(sum < target) k++;
                    else{
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
}
