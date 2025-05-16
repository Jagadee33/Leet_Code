import java.util.*;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = map.get(s.charAt(0));
        for(int value : map.values()){
            if(value != count){
                return false;
            }
        }
        return true;
    }
}