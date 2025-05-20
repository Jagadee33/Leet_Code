class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ori = x;
        int reverse = 0;
        while(x>0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x =x/10;
        }
        if(ori==reverse){
            return true;
        }
        return false;
    }
}