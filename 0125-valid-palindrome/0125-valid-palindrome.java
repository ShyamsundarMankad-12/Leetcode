class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        String lower = s.toLowerCase().trim();
        int i=0;
        int j =lower.length()-1;
        boolean ans = true;
        while(i<j){
            char ch1 = lower.charAt(i);
            char ch2 = lower.charAt(j);
            if(!((ch1>='a' && ch1<='z') || (ch1>='0' && ch1<='9'))){ i++; continue;}
            if(!((ch2>='a' && ch2<='z') || (ch2>='0' && ch2<='9'))) {j--; continue;} 
            if(ch1!=ch2) {
                ans = false;
                break;
            }
            i++;
            j--;
        }
        return ans;
        
    }
}