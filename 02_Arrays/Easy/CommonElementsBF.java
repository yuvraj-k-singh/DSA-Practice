/*
WAP: Common Elements BF
Time Complexity: O(2n*2)
Space Complexity: O(1)
Date: 29-oct-2026
*/


import java.util.Arrays;

public class CommonElementsBF {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};

        int[] ans = commonElements(nums1, nums2);
        System.out.println("Answer: "+ Arrays.toString(ans));
    }

    public static int[] commonElements(int[] nums1, int[] nums2){
        int first = 0, second = 0;

        for(int i=0; i<nums1.length; i++){
            boolean flag = false;
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true) first++;
        }

        for(int i=0; i<nums2.length; i++){
            boolean flag = false;
            for(int j=0; j<nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true) second++;
        }

        return new int[]{first, second};
    }
}
