class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-x) < Math.abs(y -z)){
            return 1;
        }
        else if(Math.abs(y -z) < Math.abs(z -x)){
            return 2;
        }
        return 0;
    }

}