// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] prePro = new int[nums.length];
//         prePro[0] = 1;
//         for(int i=1; i<nums.length; i++){
//             prePro[i] = prePro[i-1]*nums[i-1];
//         }

//         int[] suffPro = new int[nums.length];
//         suffPro[nums.length-1] = 1;
//         for(int i=nums.length-2; i>=0; i--){
//             suffPro[i] = suffPro[i+1]*nums[i+1];
//         }

//         int[] ans = new int[nums.length];
//         for(int i=0; i<nums.length; i++){
//             ans[i] = prePro[i]*suffPro[i];
//         }
//         return ans;
//     }
// }


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Prefix product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Suffix product
        int suffPro = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffPro;
            suffPro *= nums[i];
        }

        return ans;
    }
}
