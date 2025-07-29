class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb = new StringBuilder(haystack);
         int i = 0;
        if (haystack.length() <= 0 || needle.length() <= 0) {
            i = -1;
            return i;
        } else {
            while (sb.length() != 0)
                if (haystack.contains(needle)) {
                    if (haystack.startsWith(needle)) {
                        return i;
                    } else {
                        i = sb.indexOf(needle);
                        break;
                    }
                } else {
                    i=-1;
                   break;
                }
        }
        return i;
    }
}