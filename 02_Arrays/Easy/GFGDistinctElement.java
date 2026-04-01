/*
WAP: GFG Distinct Element
Time Complexity: O(n)
Space Complexity: O(n)
Date: 01-apr-2026
*/

import java.util.HashSet;

public class GFGDistinctElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};

        int size = distinctElement(arr);

        System.out.println("The total distinct Elements: "+size);
    }

    private static int distinctElement(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
