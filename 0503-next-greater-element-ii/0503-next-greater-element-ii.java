class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        // Traverse array twice because it is circular
        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            // Remove elements smaller than current element
            while (!st.isEmpty() && nums[st.peek()] < nums[index]) {
                ans[st.pop()] = nums[index];
            }

            // Store index only during first traversal
            if (i < n) {
                st.push(index);
            }
        }

        return ans;
    }
}