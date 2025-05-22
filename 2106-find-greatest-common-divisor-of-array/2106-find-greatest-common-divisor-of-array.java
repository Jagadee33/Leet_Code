import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        
        int small  = nums[0];
        int large = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<small){
                small = nums[i];
            }
            else if (nums[i]>large){
                large = nums[i];
            }
        }
        while(small>0){
            int n =large%small;
            large = small;
            small = n;
        }
          
        return large;  
        }
    }