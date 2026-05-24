class Solution {
    // public double myPow(double x, int n) {
    //        long N = n; 
    //     if (N < 0) {
    //         x = 1 / x;
    //         N = -N;
    //     }
    //     return recurse(x, N);
    // }

    // private double recurse(double x, long n) {
        
    //     if (n == 0) return 1.0;

       
    //     double half = recurse(x, n / 2);

    //     if (n % 2 == 0) {
    //         return half * half;       
    //     } else {
    //         return half * half * x;   
    //     }
    // }

     public double myPow(double x, int n) {
           long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans  =1;
        while(N>0) {
            if(N%2 !=0) {
                ans *=x;
            }
            x *=x;
            N /=2;
        }
        return ans;
        
    }
}