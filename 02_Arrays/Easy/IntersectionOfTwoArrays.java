/*
WAP: Intersection Of Two Arrays
Time Complexity: O(n)
Space Complexity: O(m+n)
Date: 21-oct-2026

*/


import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        int[] n1 = {4,9,5};
        int[] n2 = {9,4,9,8,4};

        int[] ans = intersection(n1, n2);

        System.out.println("Answer: "+ Arrays.toString(ans));
    }

    public static int[] intersection(int[] n1, int[] n2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for(int x: n1){
            set.add(x);
        }

        for(int x: n2){
            if(set.contains(x)){
                ans.add(x);
            }
        }

        int[] result = new int[ans.size()];
        int indx = 0;

        for(int x: ans){
            result[indx++] = x;
        }
        return result;
    }
}
