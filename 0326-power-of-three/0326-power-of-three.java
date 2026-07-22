class Solution {
    public boolean isPowerOfThree(int n) {
        boolean[] ans = new boolean[1];
        rec(0,n,ans);
        return ans[0];
    }
    void rec(int i,int n,boolean[] ans){
        long x = (long)Math.pow(3,i);
        if(x > n){
            return;
        }
        if(x == n){
            ans[0] = true;
            return;
        }
        rec(i+1,n,ans);
    }
}