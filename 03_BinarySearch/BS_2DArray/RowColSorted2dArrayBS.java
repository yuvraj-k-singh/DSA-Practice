/*
WAP: Row Column Sorted 2d Array BS
Time Complexity: O(m+n)
Space Complexity: O(1)
Date: 22-june-2026
*/
public class RowColSorted2dArrayBS {
    public static void main(String[] args){
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 115;

        boolean ans = sortedRowColBS(arr, target);

        if(ans) System.out.print(target+" is present in the matrix!");
        else System.out.print(target+" is not present in the matrix!");
    }

    public static boolean sortedRowColBS(int[][] arr, int k){
        int r = 0, c = arr[0].length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c] == k) return true;
            else  if(arr[r][c] > k) c--;
            else r++;
        }
        return false;
    }
}
