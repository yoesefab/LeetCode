class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int prefixlen = 0;

        while (prefixlen < strs[0].length()
                && prefixlen < strs[1].length()) {

            if (strs[0].charAt(prefixlen) != strs[1].charAt(prefixlen)) {
                break;
            }

            prefixlen++;
        }

        for (String str : strs) {
            while (prefixlen > 0 &&
                    !str.startsWith(strs[0].substring(0, prefixlen))) {
                prefixlen--;
            }
        }

        return strs[0].substring(0, prefixlen);
    }
}