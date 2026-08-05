class Solution {
    public long GCDSq(int a , int  b){
        while (b != 0) {
            int remainder = a % b;
            a = b;          // Move b to a
            b = remainder;  // Move remainder to b
        }
        return 1L*a*a;
    }
    public long maxPairStrength(int[] nums) {
        long max = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                long ans = ((long)nums[i]*nums[j]) / GCDSq(nums[i],nums[j]);
                if(ans > max) max = ans;
            }
        }
        return max;
    }
}