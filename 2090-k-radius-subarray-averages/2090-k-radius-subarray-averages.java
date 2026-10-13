class Solution {
    public int[] getAverages(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++) ans[i] = -1;

        int low = 0 , high = k+k;
        long sum = 0;
        if (2 * k + 1 > n) return ans;
        for(int i=low; i<=high; i++) sum += arr[i];

        while(high<n){
            int avg = 0;
            avg = (int)(sum / (2 * k + 1));
            ans[low+k] = avg;
            low++;
            high++;
            if(high == n) break;
            sum -= arr[low-1];
            sum += arr[high];
        }
        return ans;
    }
}