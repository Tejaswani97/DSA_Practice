class Solution {
    private static final int MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
       long evenPos = (n+1)/2;
       long oddPos = n/2;
       long res = (modPow(5,evenPos)*modPow(4,oddPos))%MOD;
       return (int)res;
    }
    private long modPow(long base,long exp){
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;

    }
}