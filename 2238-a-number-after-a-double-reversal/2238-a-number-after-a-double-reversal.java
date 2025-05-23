class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num ==0){
              return true;
        }
        int original = num;
        int reverse = 0;
        while(num>0){
            int digit = num%10;
            reverse = reverse *10 + digit;
            num = num/10;
        }
        int sum =0;
        while(reverse>0){
            int dig = reverse%10;
            sum = sum*10+dig;
            reverse = reverse/10;
        }
        if(sum != original){
            return false;
        }
        return true;
          
    
    }
}