/*
WAP: Merge Two Sorted Arrays GFG Optimal
Time Complexity: O(NlogN) + O(MlogM) + O(M+N)
Space Complexity: O(1)
Date: 04-july-2026
*/

import java.util.Arrays;

public class MergeSortedArrayGFGOptimal {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};

        mergeGFG(a, b);

        System.out.println("A after: ");
        for(int x: a) System.out.print(x+" ");

        System.out.println("\nB after: ");
        for(int x: b) System.out.print(x+" ");
    }

    public static void mergeGFG(int[] a, int[] b){
        int left = a.length-1, right = 0;

        while(left>=0 && right<b.length){
            if (a[left] > b[right]) {
                swap(a, b, left, right);
                left--;
                right++;
            }else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void swap(int[] a, int[] b, int i, int j){
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}
