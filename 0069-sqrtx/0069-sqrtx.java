class Solution {
    public int mySqrt(int x) {
        if(x <0){
            return -1;
        }
        int start =1;
        int end = x;
        int res=0;
        if(x == 0 || x==1){
            return x;
        }
        while(start <= end){
    
            int mid = (start+end)/2;
            if(mid == x/mid){
                return mid;
            }
            if(mid<=x/mid){
                start = mid + 1;
                res = mid;
            }else{
                end = mid -1;
            }
        }return res;

    }
}