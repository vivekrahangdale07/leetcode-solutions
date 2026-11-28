class Solution {
    public int countDominantElements(int[] nums) {
        int dominant = 0;
        int n = nums.length;
        if(n==1) return 1;
        if(nums[0] >= nums[1]) dominant++;
        if(nums[n-1] >= nums[n-2]) dominant++;
        for(int i=1; i<n-1; i++){
            double avg = (nums[i-1] + nums[i+1]) / 2.0;
            // System.out.println(avg);
            if((double)nums[i] >= avg) dominant++;
        } 
        return dominant;
    }
}