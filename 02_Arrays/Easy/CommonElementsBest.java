/*
WAP: Common Elements Best
Time Complexity: O(m+n)
Space Complexity: O(1)
Date: 29-oct-2026
*/

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsBest {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};

        int[] ans = commonElements(nums1, nums2);
        System.out.println("Answer: "+ Arrays.toString(ans));
    }

    public static int[] commonElements(int[] nums1, int[] nums2){
        int first = 0, second = 0;
        boolean[] set1 = new boolean[101];
        boolean[] set2 = new boolean[101];

        for(int i=0; i<nums1.length; i++){
            set1[nums1[i]] = true;
        }

        for(int i=0; i<nums2.length; i++){
            set2[nums2[i]] = true;
        }

        for(int i=0; i<nums1.length; i++){
            if(set2[nums1[i]]){
                first++;
            }
        }

        for(int i=0; i<nums2.length; i++){
            if(set1[nums2[i]]){
                second++;
            }
        }

        return new int[]{first, second};
    }
}
