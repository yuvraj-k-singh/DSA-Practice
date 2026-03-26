/*
WAP: GFG Max Consecutive Bit
Time Complexity: O(n)
Space Complexity: O(1)
Date: 15-jan-2026
*/

public class GFGMaxConsecutiveBit {

    public static int maxBit(int[] arr){
        int max = Integer.MIN_VALUE, countOnes = 0, countZeroes = 0;

        for(int x : arr){
            if(x==1){
                countZeroes = 0;
                countOnes++;
                max = Math.max(max, countOnes);
            }else{
                countOnes = 0;
                countZeroes++;
                max = Math.max(max, countZeroes);
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 0, 0};

        int ans = maxBit(arr);

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        System.out.println();
        System.out.println("\nMax Bit is: "+ans);
    }
}
