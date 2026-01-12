/*
WAP: Plus One BF
Time Complexity: O(3n)
Space Complexity: O(n)
Date: 12-jan-2026
*/

public class PlusOneBF {
    public static int[] plusOne(int[] arr){
        long num = 0;

        //1. convert arr to number
        for(int i=0; i<arr.length; i++){
            num = num*10 + arr[i];
        }

        //2. add one
        num = num + 1;

        //3. calculate length of String
        int length = String.valueOf(num).length();
        int[] ans = new int[length];

        //assign back value to arr
        for(int i = ans.length - 1; i>=0; i--){
            ans[i] = (int)(num%10);
            num/=10;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {9,9,9};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        int[] ans = plusOne(arr);

        System.out.println();
        System.out.println("\nArray elements after: ");
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
