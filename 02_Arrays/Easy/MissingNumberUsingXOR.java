/*
WAP: Missing Number Using XOR
Time Complexity: O(n)
Space Complexity: O(1)
Date: 10-jan-2026
*/

public class MissingNumberUsingXOR {

    public static int missing(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = result ^ i ^ arr[i];
        }
        return result ^ arr.length;
    }

    public static void main(String[] args){
        int[] arr = {3,4,0,1};

        System.out.print("Missing Number: " + missing(arr));
    }
}
