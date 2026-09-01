class Solution {
    public int maxSubArray_brute(int[] nums) {

        int n = nums.length;

        int max_sum = Integer.MIN_VALUE;;

        for(int i =0; i<n; i++) {

            for(int j =0; j<=i; j++) {
                int sum =0;
                for(int k =j; k<=i; k++) {
                    sum = sum + nums[k];

                    max_sum = Math.max(sum, max_sum);
                }
            }
        }
        return max_sum;
        
    }



public int maxSubArray_better(int[] nums) {

        int n = nums.length;

        int max_sum =Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {

            int sum =0;
            for(int j=i; j<n; j++) {

                sum = sum+nums[j];


                max_sum = Math.max(sum, max_sum);

            }
        }
        return max_sum;

    }




    public int maxSubArray_optimal(int[] nums) {

        int n = nums.length;

        int max_sum =Integer.MIN_VALUE;

        int sum =0;
        int start=0;
         int arrStart = 0; int arrEnd = 0;

        for(int i=0; i<n; i++) {

                if(sum ==0) 
                    start = i;               

                sum = sum+nums[i];

                if(sum>max_sum) {
                    max_sum = sum;
                    arrStart = start; arrEnd = i;
                }


                if(sum<0) {
                    sum = 0;
                }

        }
        return max_sum;

    }


    public int maxSubArray(int[] nums) {

    int currentSum = nums[0];
    int maxSum = nums[0];

    for(int i = 1; i < nums.length; i++) {

        currentSum = Math.max(nums[i], currentSum + nums[i]);

        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
}





}