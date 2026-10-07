class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int sum = 0;
        int cnt = 0;

        for(int num : nums){
            sum += num;
            int rem = sum % k;
            if (rem < 0) rem += k;

            if(map.containsKey(rem)) cnt += map.get(rem);

            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return cnt;
    }


    // public int subarraySum(int[] nums, int k) {
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     map.put(0, 1);
    //     int sum = 0;
    //     int count = 0;

    //     for (int num : nums) {
    //         sum += num;

    //         if (map.containsKey(sum - k)) {
    //             count += map.get(sum - k);
    //         }

    //         // Store current prefix sum
    //         map.put(sum, map.getOrDefault(sum, 0) + 1);
    //     }

    //     return count;
    // }
}