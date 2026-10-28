/*
WAP: Common Elements Optimal
Time Complexity: O(m+n)
Space Complexity: O(m+n)
Date: 29-oct-2026
*/

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsOptimal {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};

        int[] ans = commonElements(nums1, nums2);
        System.out.println("Answer: "+ Arrays.toString(ans));
    }

    public static int[] commonElements(int[] nums1, int[] nums2){
        int first = 0, second = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                second++;
            }
        }

        set.clear();

        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++){
            if(set.contains(nums1[i])){
                first++;
            }
        }

        return new int[]{first, second};
    }
}
