/*
WAP: Three Sum BS
Time Complexity: O(N^2)
Space Complexity: O(N^2)
Date: 28-june-2026
*/

import java.util.*;

public class ThreeSumBS {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = threeSumBS(nums);

        System.out.println("Unique Triplets are: ");
        for(List<Integer> a : ans){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSumBS(int[] nums){
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int rem = -(nums[i]+nums[j]);
                if(set.contains(rem)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],rem);
                        Collections.sort(temp);
                        ans.add(temp);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}
