class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        Map<Integer , Integer> mp = new HashMap<>();
        int sum=0;
        int maxLen=0;
        
        for(int i =0; i< n ; i++)
        {
            sum+= arr[i];
            if(sum==0)
            {
                maxLen = i+1;
            }
            else if(mp.containsKey(sum))
            {
                maxLen = Math.max(maxLen , i-mp.get(sum));
            }
            else if(!mp.containsKey(sum))
            {
                mp.put(sum , i);
            }
        }
        return maxLen;

    }
}
