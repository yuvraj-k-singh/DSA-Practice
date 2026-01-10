/*
WAP: Missing Number BF
Time Complexity: O(n^2)
Space Complexity: O(1)
Date: 10-jan-2026
*/

public class MissingNumberBF {
    public static int missing(int[] arr){
        for(int i=1; i<=arr.length; i++){
            boolean flag = false;
            for(int x : arr){
                if(x == i){
                    flag = true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,0,1};

        System.out.print("Missing Number: " + missing(arr));
    }
}
