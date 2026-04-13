class Solution {
    public int longestConsecutive_brute(int[] nums) {

        int longest =0;
        for(int i=0; i<nums.length; i++) {
            int current = nums[i];
            int count =1;

            while(contains(nums, current+1)) {

                current  = current+1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    private boolean contains(int[] nums, int target)  {

        for(int num : nums) {
            if( num == target) {
                return true;
            }
        }
        return false;
    }


    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;
        Arrays.sort(nums);

        int longest =1;
         int count =1;

         for(int i=1; i<nums.length; i++) {

            if(nums[i] ==nums[i-1]) {
                continue;
            }

            if(nums[i] == nums[i-1]+1) {
                count++;
            } else{
                count =1;
            }
            longest = Math.max(longest, count);
         }
         return longest;

        
    }


}