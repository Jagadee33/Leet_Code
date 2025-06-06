class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0;i<sb.length()-1;i++){
            int num1 = sb.charAt(i) -'0';
            int num2 = sb.charAt(i+1) -'0';
            char newch = (char)(((num1 + num2) % 10) - '0');
            sb.setCharAt(i, newch);
        }
        
        sb.setLength(sb.length()-1);
        if(sb.length() == 2){
            if(sb.charAt(0) != sb.charAt(1)) return false;
            return true;
        }
        String str = sb.toString();
        return hasSameDigits(str);
    }
}