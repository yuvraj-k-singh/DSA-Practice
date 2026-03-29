package Easy;

public class BestTimeToBuySell {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};

        int max = buySell(arr);

        System.out.println("Array elements: ");
        for(int x : arr) System.out.print(x+" ");

        System.out.println("\nMaximum profit: "+max);
    }

    private static int buySell(int[] arr) {
    }
}
