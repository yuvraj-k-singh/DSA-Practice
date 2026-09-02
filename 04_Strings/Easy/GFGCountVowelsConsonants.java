/*
WAP: GFG Count Vowels Consonants
Time Complexity: O(N)
Space Complexity: O(1)
Date: 02-sep-2026
*/

public class GFGCountVowelsConsonants {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";

        checkString(str);
    }

    public static void checkString(String str){
        int v = 0, c = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }else c++;
        }

        if(v > c) System.out.println("Yes");
        else if(v < c) System.out.println("No");
        else System.out.println("Same");
    }
}
