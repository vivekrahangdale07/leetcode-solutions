class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int low = 0 , high = k-1;
        int sum = 0;
        for(int i = low; i<=high; i++) sum += arr[i];

        double result = Double.NEGATIVE_INFINITY;;
        double avg = (double)sum/(double)k;
        while(high<n){
            result = Math.max(result,avg);
            low++;
            high++;
            if(high == n) break;
            sum -= arr[low-1];
            sum += arr[high];
            avg = (double)sum/(double)k;
        }
        return result;
    }
}
