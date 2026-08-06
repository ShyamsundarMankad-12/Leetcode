class Solution {
    public static int multiplication(int a){
        int multi = 1;
        while(a!=0){
            multi*=(a%10);
            a/=10;
        }
        return multi;
    }
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i =0;i<10;i++){
            if(multiplication(n)%t==0) {
                ans = n;
                break;
            }
            n++;
        }
        return ans;
    }
}