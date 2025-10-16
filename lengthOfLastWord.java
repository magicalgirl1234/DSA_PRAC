class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n-1;
        int count =0;
 
        if(s==null||s.isEmpty()) return 0;
        while(i >= 0 && s.charAt(i) ==' ')
        {
            i--;
        }

        while(i>=0 && !Character.isWhitespace(s.charAt(i)))
        {
            count++;
            i--;
        }
        return count;
        
    }
}
