class Solution {
    public boolean isIsomorphic_brute(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Character> charMap = new HashMap<>();

        for(int i=0; i<s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMap.containsKey(original)) {
                if(!charMap.containsValue(replacement)) {
                    charMap.put(original, replacement);
                }else {
                    return false;
                }
            } else {
                char mappedChar = charMap.get(original);

                if(mappedChar!=replacement) {
                    return false;
                }
            }
        }
        return true;
    }





    public boolean isIsomorphic_better(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> charMap = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!charMap.containsKey(original)) {

                
                if (!usedChars.contains(replacement)) {
                    charMap.put(original, replacement);
                    usedChars.add(replacement);
                } else {
                    return false;
                }

            } else {
                char mappedChar = charMap.get(original);

                if (mappedChar != replacement) {
                    return false;
                }
            }
        }
        return true;
    }







    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            
            if (mapS[c1] != mapT[c2]) {
                return false;
            }

            
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }

        return true;
    }


}