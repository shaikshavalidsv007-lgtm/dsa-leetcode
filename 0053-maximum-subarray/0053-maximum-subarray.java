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




    public int maxSubArray(int[] nums) {

        int n = nums.length;

        int max_sum =Integer.MIN_VALUE;

        int sum =0;
        int start=0;

        for(int i=0; i<n; i++) {

                if(sum ==0) 
                    start = i;               

                sum = sum+nums[i];

                if(sum>max_sum) {
                    max_sum = sum;
                    int arrStart = start; int arrEnd = i;
                }


                if(sum<0) {
                    sum = 0;
                }

        }
        return max_sum;

    }





}