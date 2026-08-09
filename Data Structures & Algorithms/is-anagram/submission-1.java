class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sTable = new HashMap<>();
        HashMap<Character, Integer> tTable = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            sTable.put(s.charAt(i),sTable.getOrDefault(s.charAt(i), 0) + 1);
            tTable.put(t.charAt(i), tTable.getOrDefault(t.charAt(i), 0)+ 1);
        }
        return tTable.equals(sTable);    
    }
}
