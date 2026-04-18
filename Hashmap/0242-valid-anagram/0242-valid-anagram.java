class Solution {
    public boolean isAnagram_brute(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        char[] tr = t.toCharArray();
        Arrays.sort(tr);

        for(int i =0; i<str.length; i++) {
            if(str[i] != tr[i]) {
                return false;
            }
        }
        return true;
    }



    public boolean isAnagram_better(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

       
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c); 
            }
        }

        return map.isEmpty();
    }




     public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // increment for s
            freq[t.charAt(i) - 'a']--; // decrement for t
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

}