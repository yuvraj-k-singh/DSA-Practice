/*
WAP: Binary search on 2D sorted Array
Time Complexity: O(log(m*n)
Space Complexity: O(1)
Date: 22-june-2026
*/

public class Sorted2dArrayBS {
    public static void main(String[] args){
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 126;

        boolean ans = sortedBS(arr, target);

        if(ans) System.out.print(target+" is present in the matrix!");
        else System.out.print(target+" is not present in the matrix!");
    }

    public static boolean sortedBS(int[][] arr, int x){
        int m = arr.length, n = arr[0].length;
        int low = 0, high = (m*n)-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int r = mid/n, c = mid%n;

            if(arr[r][c] == x) return true;
            else if(arr[r][c] > x) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}
