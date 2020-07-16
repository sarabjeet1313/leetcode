// Power function => take doubling approach and handle it.


class Solution {
    public double myPow(double x, int n) {
        
if (n == 0) return 1;
double half = Math.pow(x, n / 2);
if (n % 2 == 0) return half * half;
else if (n > 0) return half * half * x;
else return half * half / x;

    }
}
