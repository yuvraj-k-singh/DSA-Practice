/*
WAP: Merge Overlapping Subintervals LC
Time Complexity: O(NlogN)
Space Complexity: O(N)
Date: 01-july-2026
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsLC {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};

        int[][] ans = mergeIntervalsLC(arr);

        for(int[] a : ans){
            for(int x: a) System.out.print(x+" ");
            System.out.println();
        }
    }

    public static int[][] mergeIntervalsLC(int[][] arr){
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        int start = arr[0][0], end = arr[0][1];

        for(int i=0; i<arr.length; i++){
            int s = arr[i][0], e = arr[i][1];

            if(s <= end){
                end = Math.max(end, e);
            }else{
                ans.add(new int[]{start,end});
                start = s;
                end = e;
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}
