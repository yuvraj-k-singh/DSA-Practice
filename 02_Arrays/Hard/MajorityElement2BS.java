/*
WAP: Majority Element2 BS
Time Complexity: O(N)
Space Complexity: O(N)
Date: 28-june-2026
*/

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement2BS {
    public static void main(String[] args) {
        int[] nums = {2,1,1,3,1,4,5,6};

        ArrayList<Integer> ans = majorityBS(nums);

        System.out.print("Majority elements are: "+ans);
    }

    public static ArrayList<Integer> majorityBS(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = (nums.length/3) + 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) == n) ans.add(nums[i]);
        }
        return ans;
    }
}
