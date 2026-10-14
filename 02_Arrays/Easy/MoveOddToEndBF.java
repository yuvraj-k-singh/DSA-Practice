/*
WAP: Move Odd To End BF
Time Complexity: O(2N)
Space Complexity: O(N)
Date: 14-oct-2026
*/

public class MoveOddToEndBF {
    public static void main(String[] args) {
        int[] nums = {3,4,1,2,0,5,7};

        int[] ans = moveOddBF(nums);
        System.out.println("Answer: ");
        for(int x: ans) System.out.print(x+" ");
    }

    public static int[] moveOddBF(int[] nums){
        int[] result = new int[nums.length];
        int j = 0;

        for(int x: nums){
            if(x%2 == 0){
                result[j++] = x;
            }
        }

        for(int x: nums){
            if(x%2 != 0){
                result[j++] = x;
            }
        }
        return result;
    }
}
