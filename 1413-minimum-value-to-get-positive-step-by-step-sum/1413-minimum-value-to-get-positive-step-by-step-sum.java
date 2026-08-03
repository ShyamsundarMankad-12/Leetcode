class Solution {
    public int minStartValue(int[] nums) {
        int startVal = 1;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if((sum+startVal)<1) startVal = 1 - sum;
        }
        return startVal;
    }
}