class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int cnt = 0;
            int max = 0;
            while(nums[i] > 0){
                int digit = nums[i]%10;
                max = Math.max(max,digit);
                cnt++;
                nums[i] /= 10;
            }
            int place = 1;
            int encrepyt = 0;
            for(int j=0; j<cnt; j++) {
                encrepyt += place;
                place *= 10;
            }
            sum += (encrepyt*max);
        }
        return sum;
    }
}