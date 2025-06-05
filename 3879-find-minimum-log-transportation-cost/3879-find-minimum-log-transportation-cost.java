class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if(n == 0 || m ==0 ||k == 0) return 0;
        long total =0;
        if(n<=k && m<=k){
            return 0;
        }
        if(m > k && n <= k){
            total += (long)(m-k) * k;
        }
        if (n>k && m<=k) {
            total += (long)(n-k)*k;
        }
        return total;
    }

}