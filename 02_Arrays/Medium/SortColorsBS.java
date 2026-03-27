/*
WAP: Sort Colors Better Solution
Time Complexity: O(2n)
Space Complexity: O(1)
Date: 27-mar-2026
*/

public class SortColorsBS {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};

        sortColorsBF(arr);

        System.out.println("Array elements after: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void sortColorsBF(int[] arr){
        int zeroes = 0, ones = 0, twoes = 0;

        for(int x : arr){
            if(x==0) zeroes++;
            else if(x==1) ones++;
            else twoes++;
        }

        for(int i=0; i<zeroes; i++){
            arr[i] = 0;
        }

        for(int i=zeroes; i< (zeroes + ones); i++){
            arr[i] = 1;
        }

        for(int i=(zeroes + ones); i<arr.length; i++){
            arr[i] = 2;
        }
    }
}
