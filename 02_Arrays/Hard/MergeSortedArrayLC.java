/*
WAP: Merge Two Sorted Arrays LC
Time Complexity: O(M+N)
Space Complexity: O(1)
Date: 04-july-2026
*/

public class MergeSortedArrayLC {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10, 0, 0};
        int[] b = {2, 3};

        mergeLC(a, b, 4, 2);

        System.out.println("A after: ");
        for(int x: a) System.out.print(x+" ");
    }

    public static void mergeLC(int[] a, int[] b, int m, int n){
        int indx = m+n-1, i = m-1, j = n-1;

        while(i>=0 && j>=0){
            if (a[i] >= b[j]) {
                a[indx--] = a[i--];
            }else{
                a[indx--] = b[j--];
            }
        }

        while(j>=0){
            a[indx--] = b[j--];
        }
    }
}
