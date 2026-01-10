/*
WAP: Missing Number Using Math
Time Complexity: O(n)
Space Complexity: O(1)
Date: 10-jan-2026
*/

public class MissingNumberUsingMath {

    public static int missing(int[] arr) {
        int n = arr.length;
        int actualSum = n*(n+1)/2;
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return actualSum - sum;
    }

    public static void main(String[] args){
        int[] arr = {3,4,2,0,1};

        System.out.print("Missing Number: " + missing(arr));
    }
}
