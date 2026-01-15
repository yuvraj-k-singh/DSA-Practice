/*
WAP: Max Consecutive Ones
Time Complexity: O(n)
Space Complexity: O(1)
Date: 15-jan-2026
*/

public class MaxConsecutiveOnes {
    public static int maxOnes(int[] arr){
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int x : arr){
            if(x == 1) {
                count++;
                if(max < count) max = count;
            } else count = 0;
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {1,0,1,1,0,1};

        int ans = maxOnes(arr);

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        System.out.println();
        System.out.println("\nMax Ones is: "+ans);
    }
}
