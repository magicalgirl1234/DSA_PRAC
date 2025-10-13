class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int repeating = -1;
        int missing = -1;

        int n = nums.length;
        for(int i=0; i< n ; i++)
        {
             int val = Math.abs(nums[i]);
             if(nums[val -1] > 0)
             {
                nums[val -1] = -nums[val-1];

             }
             else
             {
                repeating= val;
             }
        }
       for(int i =0; i< n ; i++)
       {
        if(nums[i] > 0)
        {
            missing = i+1;
        }
       }

       return new int[]{repeating,missing};


    }
}
