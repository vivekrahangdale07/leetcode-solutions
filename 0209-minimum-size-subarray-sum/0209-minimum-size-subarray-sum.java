class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int low = 0 , high = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(high<n){
            sum += arr[high];
            while(sum>= target){
                int len = high - low + 1;
                result = Math.min(len,result);
                sum -= arr[low];
                low++;
            }
            high++;
        }
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}