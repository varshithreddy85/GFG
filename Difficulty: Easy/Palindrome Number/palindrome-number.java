class Solution {
    public boolean isPalindrome(int n) {
        // code here
        
        n = Math.abs(n);
        int dup = n;
        int rev = 0;
        
        while(n > 0){
            int digit = n % 10;
            n = n / 10;
            rev = rev * 10 + digit;
        }
        
        return dup == rev;
    }
}