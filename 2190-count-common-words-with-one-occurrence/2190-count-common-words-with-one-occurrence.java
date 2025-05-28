class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        for(String s : words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String s1 : words2){
            map2.put(s1,map2.getOrDefault(s1,0)+1);
        }
        HashSet<String> set1 = new HashSet<>();
        set1.addAll(map1.keySet());
        set1.addAll(map2.keySet());
        int count= 0;
        for(String ch:set1){
            int count1 = map1.getOrDefault(ch,0);
            int count2 = map2.getOrDefault(ch,0);
            if(count1 == 1 && count2 ==1){
                count++;
            }

        }
        return count;

        
    }
}