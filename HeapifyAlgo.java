class Solution {
  public void heapify(int[] nums, int ind, int val) {

    if (nums[ind] > val) {
      nums[ind] = val;
      heapifyUp(nums, ind);
    } else {
      nums[ind] = val;
      heapifyDown(nums, ind);
    }
  }

  private void heapifyDown(int[] arr, int ind) {
    int n = arr.length;
    int smallest_Ind = ind;

    int left_child = 2 * ind + 1;
    int right_child = 2 * ind + 2;

    if (left_child < n && arr[left_child] < arr[smallest_Ind]) {
      smallest_Ind = left_child;
    }

    if (right_child < n && arr[right_child] < arr[smallest_Ind]) {
      smallest_Ind = right_child;
    }

    if (smallest_Ind != ind) {
      int temp = arr[smallest_Ind];
      arr[smallest_Ind] = arr[ind];
      arr[ind] = temp;
      heapifyDown(arr, smallest_Ind);
    }
  }

  private void heapifyUp(int[] arr, int ind) {
    int parent_ind = (ind - 1) / 2;
    if (ind > 0 && arr[ind] < arr[parent_ind]) {
      int temp = arr[ind];
      arr[ind] = arr[parent_ind];
      arr[parent_ind] = temp;
      heapifyUp(arr, parent_ind);
    }
  }
}
