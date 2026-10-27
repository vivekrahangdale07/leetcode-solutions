class Solution {

    public int resilientSubarray(int[] nums, int k){
        long sum = 0;
        int i=0;
        int j = 0;
        int count = 0;
        int max = 1;
        int lastMod = nums[0] % k;

        while(i < nums.length && j < nums.length) {
            int curr = nums[j];

            sum += curr;

            if(curr % k == lastMod) {
                count++;
                j++;
                if((sum - curr) % k == 0)
                    max = Math.max(max, count);
            } else {
                lastMod = curr % k;
                i = j;
                sum = nums[j++];
                count = 1;
            }
        }

        return max;
    }
}