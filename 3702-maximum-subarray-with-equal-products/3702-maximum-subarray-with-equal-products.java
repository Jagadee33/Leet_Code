class Solution {
    int gcd(int a ,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    int mathgcd(int [] nums){
        int gc =nums[0];
        for(int i =1;i<nums.length;i++){
            gc = gcd(gc,nums[i]);
        }
        return gc;
    }
    int mathlcm(int [] nums){
        int lc =nums[0];
        for(int i =1;i<nums.length;i++){
            lc = lcm(lc,nums[i]);
        }
        return lc;
    }
    public int maxLength(int[] nums) {
        int maxLen = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int[] sub = Arrays.copyOfRange(nums, i, j);
                long prod = 1;
                for (int n : sub) prod *= n;
                if (prod == 1L * mathgcd(sub) * mathlcm(sub)) {
                    maxLen = Math.max(maxLen, sub.length);
                }
            }
        }
    return maxLen;
        
    }
}