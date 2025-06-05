class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n % 10);
            n /= 10;
        }
        int max1 = Collections.max(list);
        list.remove(Integer.valueOf(max1));
        int max2 = Collections.max(list);
        return max1*max2;
    }
}