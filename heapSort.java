class Solution {
    public void heapSort(int[] nums) {

        maxHeap(nums);
        int last = nums.length - 1;
        while(last > 0)
        {
            int temp = nums[0];
            nums[0] = nums[last];
            nums[last] = temp;
            last--;

            if(last >0)
            {
                heapifyDown(nums , last , 0);
            }
        }
        return ;




    }
    private void heapifyDown(int[] arr , int last , int ind)
    {
        int left_child = 2 * ind + 1;
        int right_child = 2 * ind + 2;
        int largest = ind;
        if(left_child <= last && arr[left_child] > arr[largest] )
        {
            largest = left_child;
        }
        if(right_child <= last && arr[right_child] > arr[largest])
        {
            largest = right_child;
        }

        if(largest != ind)
        {
            int temp = arr[largest];
            arr[largest] = arr[ind];
            arr[ind] = temp;
            heapifyDown(arr ,last , largest);
        }
    }

    private void maxHeap(int[] arr)
    {
        int n = arr.length;
        for(int i = n/2 - 1 ; i>=0 ; i--)
        {
            heapifyDown(arr , n-1 , i);
        }
        return ;
    }
}
