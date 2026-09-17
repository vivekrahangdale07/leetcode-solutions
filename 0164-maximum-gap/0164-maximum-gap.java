// class Solution {
//     public int maximumGap(int[] nums) {
//         if(nums.length < 2) return 0;
//         Arrays.sort(nums);
//         int ans = Integer.MIN_VALUE;
//         for(int i=1; i<nums.length; i++){
//             int diff = nums[i] - nums[i-1];
//             ans = Math.max(ans,diff);
//         }
//         return ans;
//     }
// }



class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if (n < 2) return 0;

        // Pigeonhole Principle

        // Step 1: Find minimum and maximum
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) return 0;

        // Step 2: Calculate bucket size and count
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];

        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        // Step 3: Distribute elements into buckets
        for (int num : nums) {
            int index = (num - min) / bucketSize;

            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);
        }

        // Step 4: Calculate maximum gap between buckets
        int ans = 0;
        int prevMax = min;

        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) {
                continue; // Empty bucket
            }

            int gap = bucketMin[i] - prevMax;
            ans = Math.max(ans, gap);

            prevMax = bucketMax[i];
        }

        return ans;
    }
}