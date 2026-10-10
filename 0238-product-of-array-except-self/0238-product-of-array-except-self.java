class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prePro = new int[nums.length];
        prePro[0] = 1;
        for(int i=1; i<nums.length; i++){
            prePro[i] = prePro[i-1]*nums[i-1];
        }

        int[] suffPro = new int[nums.length];
        suffPro[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            suffPro[i] = suffPro[i+1]*nums[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = prePro[i]*suffPro[i];
        }
        return ans;
    }
}