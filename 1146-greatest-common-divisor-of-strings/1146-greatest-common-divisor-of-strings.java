class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int large = str1.length();
        int small = str2.length();
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        while(small>0){
            int n = large%small;
            large = small;
            small = n;
        }
        return str1.substring(0,large);
    }
}