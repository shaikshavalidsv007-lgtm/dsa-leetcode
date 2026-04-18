class Solution {
    public int jump(int[] nums) {

        if (nums.length <= 1) return 0;
        
        int jumps = 0;
        int currentEnd = 0;  // Current jump boundary
        int farthest = 0;    // Maximum reachable index
        
        for (int i = 0; i < nums.length; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            // Jump when reaching boundary (except at last index)
            if (i == currentEnd && i != nums.length-1) {
                jumps++;
                currentEnd = farthest;  // Expand to new max reach
            }
        }
        
        return jumps;
        
    }
}