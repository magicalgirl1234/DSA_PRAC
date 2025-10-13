class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();

        int partions=1;

        for(char ch : s.toCharArray())
        {
            if(set.contains(ch))
            {
                partions++;
                set.clear();

            }

            set.add(ch);
        }
        return partions;

       
        
    }
}
