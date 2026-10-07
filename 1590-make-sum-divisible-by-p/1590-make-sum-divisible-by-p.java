class Solution {
    public int minSubarray(int[] arr, int p) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        int rem = (int) (sum % p);
        if (rem == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = arr.length;
        long preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int currRem = (int) (preSum % p);
            int req = (currRem - rem + p) % p;
            if (map.containsKey(req)) ans = Math.min(ans, i - map.get(req));
            map.put(currRem, i);
        }

        return ans == arr.length ? -1 : ans;
    }
}