class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
    HashMap<Character,Integer> map1 = new HashMap<>();
    for(int i =0; i<word1.length();i++){
        char ch = word1.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
    }
    HashMap<Character,Integer> map2 = new HashMap<>();
    for(int i =0; i< word2.length();i++){
        char ch = word2.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
    }
    Set<Character> allChars = new HashSet<>();
    allChars.addAll(map1.keySet());
    allChars.addAll(map2.keySet());

    for (char ch : allChars) {
        int count1 = map1.getOrDefault(ch, 0);
        int count2 = map2.getOrDefault(ch, 0);
        if (Math.abs(count1 - count2) > 3) {
            return false;
        }
    }

    return true;
    }
}