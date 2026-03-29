/*
WAP: Best Time To Buy and Sell
Time Complexity: O(n)
Space Complexity: O(1)
Date: 29-mar-2026
*/

public class BestTimeToBuySell {
    public static void main(String[] args){
        int[] arr = {7,6,4,3,1};

        int max = buySell(arr);

        System.out.println("Array elements: ");
        for(int x : arr) System.out.print(x+" ");

        System.out.println();
        System.out.print("\nMaximum profit: "+max);
    }

    public static int buySell(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int profit = 0;

        for(int x : arr){
            min = Math.min(min, x);
            profit = x - min;
            max = Math.max(max, profit);
        }
        return max;
    }
}
