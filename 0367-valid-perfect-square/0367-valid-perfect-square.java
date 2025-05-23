class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int n = num;
        int end = n;
        if(n == 1){
            return true;
        }
        while(start<=end){
            int mid = (start+end)/2;
            if((long)mid*mid ==num){
                return true;

            }
            else if ((long)mid*mid<num){
                start = mid+1;
            }
            else if((long)mid*mid>num){
                end = mid-1;
            }
        }
        return false;
    }
}