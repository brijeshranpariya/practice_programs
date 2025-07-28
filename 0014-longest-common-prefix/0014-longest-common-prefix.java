class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        int leastSize = strs[0].length();
        sb.replace(0, sb.length(), strs[0]);
        while (i < strs.length) {
            if (leastSize > strs[i].length()) {
                leastSize = strs[i].length();
                sb.replace(0, sb.length(), strs[i]);
            }
            i++;
        }
        i = 0;
        int j = 0;
        while (i < strs.length) {
            if (strs[i].startsWith(sb.toString())) {
                i++;
                continue;
            } else {
                sb = sb.delete(sb.length() - 1, sb.length());
                if (sb.length() == 0) {
                    sb = new StringBuilder("");
                    break;
                } else {
                    if (i != 0) {
                        i = i - 1;
                    }
                    continue;
                }
            }
        }
        return sb.toString();
    }
}