class Solution {
    boolean newmap(String s,String t){
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map1.equals(map2);
        


    }
    public boolean isAnagram(String s, String t) {
        Solution sc = new Solution();
        return sc.newmap(s,t);

    }
}