class Solution {
    public int[] twoSum_brute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }




    public int[] twoSum(int[] nums, int target) {
    
            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<nums.length; i++) {
                int third = target-nums[i];
                if(map.containsKey(third)) {
                    return new int[] {map.get(third), i};
                } 

                map.put(nums[i], i);
            }
            return new int[] {};

    }
}