import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        int i =1;
        for(String ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count =0;
        for(String s : arr){
            if(map.get(s) == 1){
                count++;
                if(count == k){
                    return s;
                }
            }

        }return "";
        }
    }