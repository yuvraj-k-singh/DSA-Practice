/*
WAP: GFG Remove Duplicates
Time Complexity: O(n)
Space Complexity: O(n)
Date: 14-jan-2026
*/

import java.util.ArrayList;

public class GFGRemoveDuplicates {

    public static ArrayList<Integer> removeDuplicate(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,4};

        ArrayList<Integer> ans = removeDuplicate(arr);

        System.out.println();
        System.out.println("\nArrayList elements are: ");
        for(int x : ans) System.out.print(x + " ");
    }
}
