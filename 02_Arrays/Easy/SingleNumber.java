/*
WAP: Single Number
Time Complexity: O(n)
Space Complexity: O(1)
Date: 15-jan-2026
*/

public class SingleNumber {

    public static int single(int[] arr){
        int result=0;

        for(int x : arr) result ^= x;
        return result;
    }

    public static void main(String[] args){
        int[] arr = {2,2,1};

        int ans = single(arr);

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        System.out.println();
        System.out.print("\nSingle number is: "+ans);
    }
}
