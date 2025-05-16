class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        int count =0;
        for(int [] ind : indices){
            rows[ind[0]]++;
            cols[ind[1]]++;

        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if((rows[i]+cols[j])%2 != 0){
                    count++;
                }
            }
        }return count;
    }
}