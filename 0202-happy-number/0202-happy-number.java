class Solution {
    private int getnewnum(int n){
        int output = 0;
        while(n>0){
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }
        return output;
    }

    public boolean isHappy(int n) {
        Set <Integer> map = new HashSet<>();
        while(!map.contains(n)){
            map.add(n);
            n = getnewnum(n);
            if(n ==1) return true;
        }
        return false;
    }
}