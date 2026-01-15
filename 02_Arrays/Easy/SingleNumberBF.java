/*
WAP: Single Number BF
Time Complexity: O(n^2)
Space Complexity: O(1)
Date: 15-jan-2026
*/

public class SingleNumberBF{
    public static int single(int[] arr){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==1) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,2,1,1};

        int ans = single(arr);

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        System.out.println();
        System.out.print("\nSingle number is: "+ans);
    }
}