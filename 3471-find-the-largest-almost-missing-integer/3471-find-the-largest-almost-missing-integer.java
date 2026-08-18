class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int max = -1;
        boolean flagS = true;
        boolean flagE = true;
        HashMap<Integer , Integer> map = new HashMap<>();
        if(k==1){
            for(int i : nums){
                map.put(i , map.getOrDefault(i ,0)+1);
            }
            for(int i : nums){
                if(map.get(i)==1){
                    max = Math.max(max,i);
                }
            }
            return max;
        }
        else if( k==n){
            for(int i = 0; i < n ;i++){
                max = Math.max(max , nums[i]);
            }
            return max;
        }
        int first = nums[0];
        int last = nums[n - 1];
        
        int firstFreq = 0;
        int lastFreq = 0;
        
        for (int num : nums) {
            if (num == first) firstFreq++;
            if (num == last) lastFreq++;
        }
        
        if (firstFreq == 1 && lastFreq == 1) {
            return Math.max(first, last);
        }
        
        if (firstFreq == 1) return first;
        if (lastFreq == 1) return last;
        
        return -1;
    }
}