class Solution {
    public char findTheDifference(String s, String t) {
        int[] fs = new int[26];
        int[] ft = new int[26];
        Arrays.fill(fs,0);
        Arrays.fill(ft,0);
        for(char c : s.toCharArray()){
            fs[c-'a']++;
        }
        for(char c : t.toCharArray()){
            ft[c-'a']++;
        }
        int index = 0;
        for(int i = 0; i < 26 ; i++){
            if(ft[i]!=fs[i]) {
                index = i;
                break;
            }
        }
        return (char) (index + 'a');

    }
}