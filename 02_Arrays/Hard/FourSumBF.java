/*
WAP: Four Sum BF
Time Complexity: O(N^4)
Space Complexity: O(N^2)
Date: 30-june-2026
*/

import java.util.*;

public class FourSumBF {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int target = 8;

        List<List<Integer>> ans = fourSumBF(nums, target);

        for(List<Integer> a : ans){
            for(int x: a) System.out.print(x+" ");
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSumBF(int[] nums, int target){
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    for(int l=k+1; l<n; l++){
                        long sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if(sum == target){
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
