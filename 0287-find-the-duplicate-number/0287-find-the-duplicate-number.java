// When elements are in range [1,n] then always try with index 
// fast  weill move two time therefore fast = nums[nums[fast]] , slow will move 1 time so slow = nums[slow] 
// after first loop cycle has been detected , fast and slow will be same afteer 1st loop , but in can be anything inside a cycle , not a duplicate 
// so to find duplicate we need the second loop
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int n = nums.length;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        slow = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}