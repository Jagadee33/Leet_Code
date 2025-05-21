class Solution {
    public int countTriples(int n) {
        int count =0;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                int sumofsqr = i*i+j*j;
                int c = (int)Math.sqrt(sumofsqr);
                if(c<=n && c*c==sumofsqr){
                    count++;
                }
            }
        }return count;
    }
}