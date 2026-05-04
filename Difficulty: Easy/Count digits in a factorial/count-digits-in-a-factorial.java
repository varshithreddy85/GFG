class Solution {
    static int facDigits(int N) {
        
        if (N <= 1) return 1;

        double sum = 0.0;

        for (int i = 2; i <= N; i++) {
            sum += Math.log10(i);
        }

        return (int) sum + 1;
    }
}