// We are applying binary search on sum of array
// like if want sum to be mid then how many subarrays will be required , if count of subarray is <= k then that sum is valid candidate , we wanted to minimize that so just keep storing answer and checking for the smaller sum (in if condition)  


class Solution {
    public boolean isValid(int[] nums , int k , int mid){
        if(nums.length < k) return false;
        int count = 1;
        int sum = 0;
        for(int i : nums){
            if(sum + i > mid){
                count++;
                sum = i;
            }
            else{
                sum+=i;
            }
        }
        return count<=k;
    }

    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int i : nums){
            low = Math.max(low,i);
            high+=i;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;         
            if(isValid(nums , k , mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}