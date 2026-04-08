class Solution {
    public List<List<Integer>> threeSum_bruteforce(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        for( int i=0; i<n-2; i++) {
            for(int j =i+1; j<n-1; j++) {
                for(int k = j+1; k<n; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }


    public List<List<Integer>> threeSum_better(int[] nums) {

        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();

            for(int i=0; i<n-2; i++) {
                Set<Integer> set = new HashSet<>();
                for(int j =i+1; j<n; j++) {
                    int third = - (nums[i]+nums[j]);

                    if(set.contains(third)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                    set.add(nums[j]);
                }
            }
            return new ArrayList<>(result);
        
    }


    public List<List<Integer>> threeSum(int[] nums) {
           
           Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            int n = nums.length;
        for(int i =0; i<n-2 ;i++) {

            if(i>0 && nums[i]==nums[i-1]) continue;

            int l = i+1; int r = n-1;

            while(l<r) {
                int sum = nums[i] + nums[l]+nums[r];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                } else if( sum <0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return result;
    }
}