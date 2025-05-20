class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int [] diff = new int[n+1];
        for(int [] q : queries){
            int start = q[0];
            int end = q[1];
            diff[start] += 1;
            if(end+1<n){
                diff[end+1] -= 1;
            }
        }
        int running =0;
        for(int i=0;i<n;i++){
            running += diff[i];
            nums[i] -= Math.min(running,nums[i]);
        }
        for(int num:  nums){
            if(num != 0){
                return false;
            }
        }return true;
        }
    }