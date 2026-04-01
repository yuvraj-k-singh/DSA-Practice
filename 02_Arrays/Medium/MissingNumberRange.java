/*
WAP: Missing Number Range
Time Complexity: O(n)
Space Complexity: O(n)
Date: 01-apr-2026
*/

import java.util.ArrayList;
import java.util.HashSet;

public class MissingNumberRange {
    public static void main(String[] args){
        int[] arr = {1, 4, 11, 51, 52, 15};
        int low = 50, high = 55;

        ArrayList<Integer> ans= missingElementRange(arr, low, high);

        System.out.println("The missing elements: ");
        for(int x : ans) System.out.print(x+" ");
    }

    private static ArrayList<Integer> missingElementRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) set.add(x);

        for(int i=low; i<=high; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
