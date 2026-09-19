/*
WAP: String To Integer Optimal
Time Complexity: O(N)
Space Complexity: O(N)
Date: 19-sep-2026
*/

public class StringToIntegerOptimal {
    public static void main(String[] args){
        String s = " -272 gfg";

        int ans = stringToInteger(s);
        System.out.println("The answer: "+ans);
    }

    public static int stringToInteger(String s){
        s = s.trim();
        if(s.length() == 0) return 0;

        int i = 0, n = s.length(), sign = 1;
        long ans = 0;

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i<n && (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
            ans = ans*10 + (s.charAt(i) - '0');
            if(ans*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(ans*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)ans*sign;
    }
}
