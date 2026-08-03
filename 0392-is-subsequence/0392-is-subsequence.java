class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1 = s.length();
        if(l1==0) return true;
        int l2 = t.length();
        int j = 0;
        for(int i = 0;i<l2;i++){
            if(j<l1 && t.charAt(i)==s.charAt(j)){
                j++;
            }
            // early exit
            if(j==l1) return true;
        }
        return j==l1;
    }
}