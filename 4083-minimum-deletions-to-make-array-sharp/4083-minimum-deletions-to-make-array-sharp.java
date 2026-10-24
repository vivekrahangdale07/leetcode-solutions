class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length;
        int i = 0; 
        int j = 1;
        int cnt = 0;
        while(j<n){
            int xor = nums[i]^nums[j];
            if(xor == 0) cnt++;
            i++;
            j++;
        }
        return cnt;
    }
}