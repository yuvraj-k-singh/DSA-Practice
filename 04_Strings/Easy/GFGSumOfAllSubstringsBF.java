/*
WAP: GFG Sum Of All Substrings BF
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 03-sep-2026
*/

public class GFGSumOfAllSubstringsBF {
    public static void main(String[] args){
        String s = "6759";

        int sum = sumSubstrings(s);
        System.out.println("The sum of all SubString is: "+sum);
    }

    private static int sumSubstrings(String s){
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                int x = Integer.parseInt(s.substring(i, j+1));
                sum += x;
            }
        }
        return sum;
    }
}
