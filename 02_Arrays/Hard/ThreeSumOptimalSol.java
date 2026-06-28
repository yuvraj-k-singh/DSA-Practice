/*
WAP: Three Sum Optimal Sol
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 28-june-2026
*/

import java.util.*;

public class ThreeSumOptimalSol {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = threeSumOS(nums);

        System.out.println("Unique Triplets are: ");
        for(List<Integer> a : ans){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSumOS(int[] nums){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1, k=n-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
