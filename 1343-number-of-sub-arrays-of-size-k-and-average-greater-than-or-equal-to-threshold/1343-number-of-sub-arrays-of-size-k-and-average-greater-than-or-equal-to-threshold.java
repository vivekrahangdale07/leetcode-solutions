class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int low = 0 , high = k-1;
        int sum = 0;
        for(int i=low; i<=high; i++) sum += arr[i];
        int cnt = 0;
        while(high<n){
            int avg = sum/k;
            if(avg>=threshold) cnt++;
            low++;
            high++;
            if(high == n) break;
            sum -= arr[low-1];
            sum += arr[high];
        }
        return cnt;
    }
}