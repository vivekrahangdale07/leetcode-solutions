class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int n = arr.length;
        int maxLen = 1;
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1] < arr[i]) cnt++;
            else cnt = 1;
            maxLen = Math.max(maxLen,cnt);
        }
        return maxLen;
    }
}