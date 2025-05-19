class Solution {
    public String validtri(int a,int b,int c){
        if(a+b>c && b+c>a && c+a>b){
            if(a==b && b==c && c==a){
                return "equilateral";
            }
            else if(a==b || b==c || c==a){
                return "isosceles";
            }
            else if(a != b && b != c && c != a){
                return "scalene";
            }  
        }
        return "none";
    }
    public String triangleType(int[] nums) {
        int a  = nums[0];
        int b  = nums[1];
        int c = nums[2];
        Solution sc = new Solution();
        return sc.validtri(a,b,c);
    }
}