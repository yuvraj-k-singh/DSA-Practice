/*
WAP: GFG Common Elements
Time Complexity: O(NlogN)
Space Complexity: O(n)
Date: 26-mar-2026
*/

import java.util.ArrayList;
import java.util.Arrays;

public class GFGCommonElements {
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};

        ArrayList<Integer> ans = commonElements(a, b);
        System.out.println("Common elements: ");
        for(int x : ans){
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0, j=0;

        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }
}
