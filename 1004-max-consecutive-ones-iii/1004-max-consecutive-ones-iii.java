class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int low = 0, maxLen = 0, zeros = 0;
        for(int high = 0; high<n; high++){
            if(arr[high]==0) zeros++;
            if(zeros > k){
                if(arr[low] == 0) zeros--;
                low++;
            }
            if (zeros <= k) {
                int len = high - low + 1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}