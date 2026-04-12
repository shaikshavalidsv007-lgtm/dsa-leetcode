class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for(int i =0; i<magazine.length(); i++){
            char mz = magazine.charAt(i);
            if(map.containsKey(mz)) {
                map.put(mz, map.get(mz) +1);
            }else{
                map.put(mz, 1);
            }
        }

        int count =0;

        for(int i =0; i<ransomNote.length(); i++){

            char ch = ransomNote.charAt(i);

            if(map.containsKey(ch) && map.get(ch)>0) {
                    count++;
                    map.put(ch, map.get(ch)-1);
            }else{
                    break;
            }

        }

        return count == ransomNote.length();
        
    }
}