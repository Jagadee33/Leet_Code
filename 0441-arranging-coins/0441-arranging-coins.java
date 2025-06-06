class Solution {
    public int arrangeCoins(int n) {
        long high =n , low = 0;
        while(low <= high){
            long mid = (low+high)/2;
            long total = mid *(mid+1)/2;
            if(total == n){
                return (int) mid;
            }
            else if(total < n){
                low = mid + 1;
            }
            else if(total > n){
                high = mid - 1;
            }
        }return (int) high;
    }
}