class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for(String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);
            if(!mp.containsKey(sortedWord)) {
                List<String> values = new ArrayList<>();
                values.add(word);
                mp.put(sortedWord,values);
                output.add(values);
            } else {

                mp.get(sortedWord).add(word);
            }
        }
        return output;
        
    }
}