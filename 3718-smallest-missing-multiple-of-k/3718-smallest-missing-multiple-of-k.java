class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int temp = k;
        while(s.contains(k)){
            k += temp;
        }
        return k;
    }
}