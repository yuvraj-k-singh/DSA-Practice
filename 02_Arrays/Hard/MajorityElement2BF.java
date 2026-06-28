/*
WAP: Majority Element2 BF
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 28-june-2026
*/

import java.util.ArrayList;

public class MajorityElement2BF {
    public static void main(String[] args) {
        int[] nums = {2,2};

        ArrayList<Integer> ans = majorityBF(nums);

        System.out.print("Majority elements are: "+ans);
    }

    public static ArrayList<Integer> majorityBF(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(ans.size()==0 || !ans.contains(nums[i])){
                int cnt = 0;
                for(int j=0; j<n; j++){
                    if(nums[i]==nums[j]) cnt++;
                }
                if(cnt>n/3) ans.add(nums[i]);
            }
        }
        return ans;
    }
}
