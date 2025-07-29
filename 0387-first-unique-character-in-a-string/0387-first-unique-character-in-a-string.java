class Solution {
    public int firstUniqChar(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        if (s.length() == 0) {
             return -1;
        } else if (s.length() == 1) {
            return 0;
        } else {
            while (i < s.length()) {
                sb.deleteCharAt(i);
                String temp = String.valueOf(s.charAt(i));
                if (sb.toString().contains(temp)){
                    sb = new StringBuilder(s);
                    if (i == s.length() - 1) {
                        i = -1;
                        break;
                    }
                    i++;
                }else{
                    break;
                }
                    ;
            }
        }
        return i;
    }
}