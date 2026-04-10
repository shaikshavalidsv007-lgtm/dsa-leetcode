class Solution {
    public int lengthOfLongestSubstring_bruteforce(String s) {

        int maxLen = 0;
        for(int i = 0; i<s.length(); i++) {
                Set<Character> seen = new HashSet<>();

            for( int j=i; j<s.length(); j++) {

                Character c = s.charAt(j);

                if(seen.contains(c)) {
                    break;
                }
                seen.add(c);
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
        
    }




    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right<s.length(); right++) {
                
                char c = s.charAt(right);
                if(map.containsKey(c)) {
                    left =Math.max( left, map.get(c)+1);
                }
                map.put(c,right);
                maxLen = Math.max(maxLen, right-left+1);
            
        }
        return maxLen;
        
    }










}