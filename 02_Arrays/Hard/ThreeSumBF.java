/*
WAP: Three Sum BF
Time Complexity: O(N^3)
Space Complexity: O(N^2)
Date: 28-june-2026
*/

import java.util.*;

public class ThreeSumBF {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = threeSumBF(nums);

        System.out.println("Unique Triplets are: ");
        for(List<Integer> a : ans){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSumBF(int[] nums){
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
