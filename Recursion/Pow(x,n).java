class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0){
            return 1.0/Solve(x,-N);
        }
        return Solve(x,N);
    }
    private double Solve(double x,long n){
        if(n==0){
            return 1.0;
        }
        double half = Solve(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}
