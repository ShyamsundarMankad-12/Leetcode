class Solution {
    public int minimumPushes(String word) {
        HashMap<Character , Integer> map = new HashMap<>();
        int[] f = new int[26];
        Arrays.fill(f,0);
        for(char c : word.toCharArray()){
            f[c - 'a']++;
        }
        int ans = 0;
        int ind = 0;
        Arrays.sort(f);
        for(int i = 25 ; i>=0 ; i--){
            int p = (ind/8) + 1;
            ans += f[i]*p;
            ind++;
        }
        return ans;



    }
}