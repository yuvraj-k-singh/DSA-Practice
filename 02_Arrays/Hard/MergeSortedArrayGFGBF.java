/*
WAP: Merge Two Sorted Arrays GFG BF
Time Complexity: O((M+N)logM+N)
Space Complexity: O(M+N)
Date: 04-july-2026
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrayGFGBF {
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
        List<Integer> ans = new ArrayList<>();

        for(int x: a) ans.add(x);
        for(int y: b) ans.add(y);
        Collections.sort(ans);

        int k = 0;
        for(int i=0; i<a.length; i++){
            a[i] = ans.get(k);
            k++;
        }

        for(int j=0; j<b.length; j++){
            b[j] = ans.get(k);
            k++;
        }
    }
}
