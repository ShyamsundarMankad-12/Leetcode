class Solution {
    public int firstUniqChar(String s) {
        int[] f = new int[26];
        Arrays.fill(f,0);
        for(char c : s.toCharArray()){
            f[c - 'a']++;
        }
        int len = s.length();
        for(int i = 0;i<len;i++){
            if(f[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}