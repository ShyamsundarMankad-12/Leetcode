// logic :-  a ^ 0 = a;
class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        // totalxor = (all elements xor except x) ^ x
        // if totalxor = 0 
        // then x ^ (all elements xor except x) ^ x = 0 ^ x
        // so x ^ x = 0
        // (all elements xor) ^ 0  = 0 ^ x
        // (all elements xor) = x


        int totalXOR = 0;
        int nonZero = 0;

        for (int num : nums) {
            totalXOR ^= num;
            if (num != 0) nonZero++;
        }

        // jo nonZero == 0 means badha non zero j chhe to xor zero j aavse and subsequence nai made 
        if (nonZero == 0) return 0;


        // jo totalXor = 0 hase to khali aek element remove karva thi pan totalXOR 0 thai jase 
        return totalXOR != 0 ? n : n - 1;
    }
}