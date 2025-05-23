class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0,j=(long)Math.sqrt(c);
        while(i<=j){
            long curr = i*i+j*j;
            if(curr==c) return true;
            else if(curr<c) i++;
            else j--;
        }
        return false;
    }
}