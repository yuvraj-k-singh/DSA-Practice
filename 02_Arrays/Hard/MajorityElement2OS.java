/*
WAP: Majority Element2 Optimal Soln
Time Complexity: O(N)
Space Complexity: O(1)
Date: 28-june-2026
*/

import java.util.ArrayList;
import java.util.Collections;

public class MajorityElement2OS {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1, 3, 2, 1, 1};

        ArrayList<Integer> ans = majorityBS(nums);

        System.out.print("Majority elements are: "+ans);
    }

    public static ArrayList<Integer> majorityBS(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0, ele1 = 0, ele2 = 0;

        for(int x: nums){
            if(cnt1 == 0 && x!=ele2){
                cnt1 = 1;
                ele1 = x;
            }else if(cnt2 == 0 && x!=ele1){
                cnt2 = 1;
                ele2 = x;
            }else if(ele1 == x) cnt1++;
            else if(ele2 == x) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }

        int check1 = 0, check2= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == ele1) check1++;
            if(nums[i] == ele2) check2++;
        }

        if(check1 > n/3) ans.add(ele1);
        if(check2 > n/3) ans.add(ele2);
        Collections.sort(ans);
        return ans;
    }
}
