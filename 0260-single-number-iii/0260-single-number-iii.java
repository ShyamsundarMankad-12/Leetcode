// totalxor willl give xor of two distinct numbeer all other elements' xor will be 0 due to their duplicates , after it we find rightmostsetbit , there are two case when rightmostset bit can be 1 (0 xor 1) or (1 xor 0) so it meansa we can divide the whole array into two parts , 1 part is having that rightmost bit 1 and another have 0 ,  if we xor into the part the all elements' xor will be 0 only the element will remain in both part , so that is out answer 
class Solution {
    public int[] singleNumber(int[] nums) {
        int totalXOR = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            totalXOR^=nums[i];
        } 
        // this is right most set bit of totalxor 
        int rightMostSetBit = totalXOR & -totalXOR;
        // making two parts having same bit at {rightMostSetBit} and other {rightMostSetBit} not same 
        int b1 = 0;
        int b2 = 0;
        // in array there can be multiple elements having {rightMostSetBit} same and different to , so doing xor will cancle all same elements 
        for(int i = 0;i<n;i++){
            // if the {rightMostSetBit} is same then ans will > 0 
            if((nums[i] & rightMostSetBit) != 0) b1^=nums[i];
            // otherwise 1
            else b2^=nums[i];
        }
        return new int[]{b1,b2};
    }
}