class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] f = new int[26];
        for(char c : licensePlate.toCharArray()){
            if(c >= 'A' && c<= 'Z'){
                f[c - 'A']++;
            }
            else if(c>='a' && c<='z'){
                f[c - 'a']++;
            }
        }
        String ans = "";
        int minLength = Integer.MAX_VALUE;
        boolean flag = true;
        int[] ft = new int[26];
        Arrays.fill(ft,0);
        for(String s : words){
            for(char c : s.toCharArray()){
                ft[c-'a']++;
            }
            for(int i = 0;i<26;i++){
                if(ft[i] < f[i]) {
                    flag = false;
                    break;
                }
            }
            if(s.length() < minLength  && flag) {
                minLength = s.length();
                ans = s;
            }
            Arrays.fill(ft,0);
            flag = true;
        }
        return ans;
    }
}