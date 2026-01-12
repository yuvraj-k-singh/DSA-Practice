/*
WAP: GFG Adding One
Time Complexity: O(n)
Space Complexity: O(1)
Date: 12-jan-2026
*/

import java.util.ArrayList;
import java.util.Collections;

public class GFGAddingOne {
    public static ArrayList<Integer> addingOne(int[] arr){
        int carry = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] < 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }else{
                arr[i] = 0;
                carry = 1;
                ans.add(arr[i]);
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {9};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        ArrayList<Integer> ans = addingOne(arr);

        System.out.println();
        System.out.println("\nArray elements after: ");
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
