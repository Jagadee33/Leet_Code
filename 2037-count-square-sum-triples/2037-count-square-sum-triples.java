class Solution {
    public int countTriples(int n) {
        int count =0;
        for(int a = 1; a<=n;a++){
            for(int b =1;b<=n;b++){
                for(int c=1;c<=n;c++){
                    if(c<=n && c*c==a*a+b*b){
                        count++;
                    }
                }
            }
        }return count;
    }
}