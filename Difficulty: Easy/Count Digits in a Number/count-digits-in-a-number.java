class Solution {
    public static int countDigits(int n) {
        // Code here
        if(n == 0) return 1;
        
        return (int) Math.log10(Math.abs(n)) + 1;
    }
}
