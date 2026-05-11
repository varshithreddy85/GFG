class Solution {
    public boolean palindromePair(String[] arr) {
        int n = arr.length;
        if (n < 2) return false;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            String s = arr[i];
            int len = s.length();

            for (int j = 0; j <= len; j++) {
                String str1 = s.substring(0, j);
                String str2 = s.substring(j);

                if (isPalindrome(str1)) {
                    String reverseStr2 = new StringBuilder(str2).reverse().toString();
                    if (map.containsKey(reverseStr2) && map.get(reverseStr2) != i) {
                        return true;
                    }
                }

                if (j < len && isPalindrome(str2)) {
                    String reverseStr1 = new StringBuilder(str1).reverse().toString();
                    if (map.containsKey(reverseStr1) && map.get(reverseStr1) != i) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}