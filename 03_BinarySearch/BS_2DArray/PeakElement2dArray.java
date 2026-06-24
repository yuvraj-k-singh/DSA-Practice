/*
WAP: Peak Element 2d Array
Time Complexity: O(log(m*n))
Space Complexity: O(1)
Date: 22-june-2026
*/

public class PeakElement2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,4},{3,2}};

        int[] ans = peakElement(arr);

        System.out.println("Peak Element row and col: ");
        for(int x: ans) System.out.print(x+" ");
    }

    public static int[] peakElement(int[][] arr){
        int m = arr.length, n = arr[0].length;
        int low = 0, high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int row = maxElem(arr, mid);

            int left = (mid-1 >= 0) ? arr[row][mid-1] : -1;
            int right = (mid+1 < n) ? arr[row][mid+1] : -1;

            if(arr[row][mid] > left && arr[row][mid] > right){
                return new int[]{row,mid};
            }else if(arr[row][mid] > left && arr[row][mid] < right){
                low = mid+1;
            }else high = mid-1;
        }
        return new int[]{-1,-1};
    }

    private static int maxElem(int[][] arr, int c){
        int ans = Integer.MIN_VALUE, indx = -1;
        for(int i=0; i<arr.length; i++){
            if(ans < arr[i][c]){
                ans = arr[i][c];
                indx = i;
            }
        }
        return indx;
    }
}
