/*
WAP: Add Two Integers
Time Complexity: O(1)
Space Complexity: O(1)
Date: 20-mar-2026
*/

public class AddTwoIntegers {
    public static void main(String[] args){
        int a = 2, b =4;

        int sum = add(a,b);

        System.out.println("The sum is: "+sum);
    }
    public static int add(int a, int b) {
        return a+b;
    }
}
