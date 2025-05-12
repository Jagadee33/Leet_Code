class Solution {
    int[] k = new int[46];
    public int climbStairs(int n) {
        if(n<=2) return n;
        if(k[n] != 0) return k[n];
        return k[n] = climbStairs(n-1) + climbStairs(n-2);
        
    }
}