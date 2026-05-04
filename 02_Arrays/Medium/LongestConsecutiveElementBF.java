/*
WAP: Longest Consecutive Element BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 04-may-2026
*/

public class LongestConsecutiveElementBF {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};

        int length = longestConsectiveBF(arr);

        System.out.print("Longest consecutive length is: " +length);
    }

    public static int longestConsectiveBF(int[] arr){
        int longest = 1;

        for(int i=0; i<arr.length; i++){
            int count = 1;
            int x = arr[i];
            while(ls(arr, x+1) == true){
                count++;
                x++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    private static boolean ls(int[] arr, int search){
        for(int x : arr){
            if(search == x) return true;
        }
        return false;
    }
}
