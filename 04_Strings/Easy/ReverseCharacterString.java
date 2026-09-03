/*
WAP: Reverse Character String
Time Complexity: O(N)
Space Complexity: O(1)
Date: 03-sep-2026
*/

public class ReverseCharacterString {
    public static void main(String[] args){
        char[] ch = {'Y','u','v','r','a','j'};

        reverseCharString(ch);

        for(char x: ch) System.out.print(x+" ");
    }

    public static void reverseCharString(char[] s){
        int i = 0, j = s.length-1;
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
