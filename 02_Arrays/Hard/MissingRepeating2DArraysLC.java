/*
WAP: Missing Repeating 2D Arrays LC
Time Complexity: O(N^2)
Space Complexity: O(N^2)
Date: 05-july-2026
*/

public class MissingRepeating2DArraysLC {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,2}};

        int[] ans = missingRepeatingLC(arr);

        System.out.print("Repeating and Missing number are: ");
        for(int x: ans) System.out.print(x+" ");
    }

    public static int[] missingRepeatingLC(int[][] arr){
        int n = arr.length;
        int size = n*n;
        int Sn = size*(size+1)/2;
        int sum = 0;

        int[] ans = new int[2];
        int[] temp = new int[size+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(temp[arr[i][j]] != 0){
                    ans[0] = arr[i][j];
                }else{
                    sum += arr[i][j];
                    temp[arr[i][j]] = 1;
                }
            }
        }
        ans[1] = Sn - sum;
        return ans;
    }
}
