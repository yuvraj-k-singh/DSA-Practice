/*
WAP: First and Last Position of X BF
Time Complexity: O(N)
Space Complexity: O(1)
Date: 09-june-2026
*/

import java.util.ArrayList;

public class firstAndLastPositionBF {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target =  7;

        ArrayList<Integer> ans = firstAndLastBS(arr, target);

        System.out.print("First and last occurrence of "+target+" is: "+ans);
    }

    public static ArrayList<Integer> firstAndLastBS(int[] arr, int x){
        ArrayList<Integer> ans = new ArrayList<>();

        int first = -1, last = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                if(first == -1) first = i;
                last = i;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}
