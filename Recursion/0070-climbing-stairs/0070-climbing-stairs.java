class Solution {
    public int climbStairs_1(int n) {

        if(n<=1) return 1;

        int[] dp = new int[n+1];
            dp[0]=1;
            dp[1] =1;
            ///dp[2] =2;

            for(int i =2; i<=n; i++) {
                dp[i] = dp[i-1] +dp[i-2];
            }

            return dp[n];
        
    }


    public int climbStairs_2(int n) {

        if(n<=2) return n;

        return climbStairs_2(n-1) + climbStairs_2(n-2);

       
    }

    public int climbStairs(int n) {

        if(n<=2) {
            return n;
        }
           int prev0 =1;
           int prev1 =2;

            for(int i=3;i<=n; i++) {
                int temp = prev0+prev1;
                prev0 = prev1;
                prev1 = temp;
            }

            return prev1;
        
    }

}