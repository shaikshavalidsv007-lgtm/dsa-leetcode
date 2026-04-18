class Solution {
    public void rotate_optimal(int[] nums, int k) {

        int n = nums.length;
        k =k%n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    private void reverse(int[] nums, int start, int end) {

        while(start<=end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public void rotate_brute(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for(int i = 0; i < k; i++) {

            int last = nums[n - 1];

            for(int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = last;
        }
    }




    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}