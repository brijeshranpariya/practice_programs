class Solution {
        public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseString(str.substring(1, str.length())) + str.substring(0, 1);
    }

    public boolean isPalindrome(int x) {
        String s= Integer.toString(x);
            if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2, s.length()).equals(reverseString(s.substring(0, (s.length() / 2))));
        } else {
            System.out.println(reverseString(s) + " : " + s);
            return reverseString(s).equals(s);
        }
    }
}