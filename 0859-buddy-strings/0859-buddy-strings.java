class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        if(s.length()==2 && s.charAt(0)==s.charAt(1)) return true;  

        int i1 = -1;
        int i2 = -1;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(i1==-1) i1 = i;
                else if(i2==-1) i2 = i;
                else return false;
            }
        }
        

        if (i1 != -1 && i2 != -1) {
            return s.charAt(i1) == goal.charAt(i2)
                    && s.charAt(i2) == goal.charAt(i1);
        }

        // No mismatches: need duplicate character to perform a valid swap
        if (i1 == -1) {
            boolean[] seen = new boolean[26];

            for (char ch : s.toCharArray()) {
                if (seen[ch - 'a']) return true;
                seen[ch - 'a'] = true;
            }
        }

        return false;
    }
}