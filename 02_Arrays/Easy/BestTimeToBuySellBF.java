/*
WAP: Best Time To Buy and Sell BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 29-mar-2026
*/

public class BestTimeToBuySellBF {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};

        int max = buySell(arr);

        System.out.println("Array elements: ");
        for(int x : arr) System.out.print(x+" ");

        System.out.println("\nMaximum profit: "+max);
    }

    public static int buySell(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int profit = 0;

        for(int i=0; i<arr.length; i++){
            min = arr[i];
            for(int j=i; j<arr.length; j++){
                profit = arr[j] - min;
                max = Math.max(max, profit);
            }
        }
        return max;
    }
}
