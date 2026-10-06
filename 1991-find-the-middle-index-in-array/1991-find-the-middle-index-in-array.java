class Solution {
    // public int findMiddleIndex(int[] nums) {
    //     int n = nums.length;
    //     int sum  = 0; 
    //     for(int i=n-1; i>0; i--) {
    //         sum += nums[i];
    //     }

    //     int i = 0; int leftSum = 0;
    //     while(i<=n-1) {
    //         if(leftSum == sum) return i;
    //         i++;

    //         leftSum += nums[i-1];
    //         if(i<n) sum -= nums[i];
    //     }
    //     return -1;
    // }

    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum  = 0; 
        for (int i = n - 1; i >= 0; i--) sum += nums[i];
        int leftSum = 0;
        for(int i=0; i<n; i++){
            int rightSum = sum-leftSum-nums[i];
            if(leftSum==rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    
}