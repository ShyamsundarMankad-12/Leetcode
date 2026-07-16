class Solution {
    public int GCD(int a , int b){
        if(a == 0) {
            return b;
        }
        return GCD(b%a,a);
    }
    public long gcdSum(int[] nums) {
        int max = -1;
        int k = 0;
        int[] p = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            // System.out.print(max);
            p[k++] = GCD(max,nums[i]);
        }
        Arrays.sort(p);
        int s = 0;
        int e = p.length - 1;
        long sum = 0;
        while(s<e){
            sum+=GCD(p[s],p[e]);
            s++;
            e--;
        }
        return sum;
    }
}