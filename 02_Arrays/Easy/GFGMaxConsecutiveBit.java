/*
WAP: GFG Max Consecutive Bit
Time Complexity: O(n)
Space Complexity: O(1)
Date: 15-jan-2026
*/

public class GFGMaxConsecutiveBit {

    public static int maxBit(int[] arr){
        int max = 0, ones = 0, zeroes = 0;

        for(int x : arr){
            //check for 1
            if(x==1){
                ones++;
                if(max < ones) max = ones;
            }else ones = 0;

            //check for 0
            if(x==0){
                zeroes++;
                if(max < zeroes) max = zeroes;
            }else zeroes = 0;
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {0, 0, 0, 0};

        int ans = maxBit(arr);

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        System.out.println();
        System.out.println("\nMax Bit is: "+ans);
    }
}
