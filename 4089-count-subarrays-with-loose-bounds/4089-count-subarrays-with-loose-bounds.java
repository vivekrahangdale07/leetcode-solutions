class Solution {
    public long countSubarrays(int[] arr, int minK, int maxK) {
        int n = arr.length;
        long cnt = 0;
        int low = 0;
        for(int high = 0; high <n; high++){
            if(arr[high] <= maxK && arr[high] >= minK) cnt += high - low + 1;
            if(arr[high] > maxK || arr[high] < minK) low = high + 1;
        }
        return cnt;
    }
}