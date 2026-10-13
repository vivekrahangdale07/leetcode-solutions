class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = k-1;
        long sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = low; i <= high; i++) {
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        long result = 0;
        while (high < n) {
            if (map.size() == k) result = Math.max(result, sum);

            low++;
            high++;

            if (high == n) break;

            int outgoing = arr[low - 1];
            sum -= outgoing;

            map.put(outgoing, map.get(outgoing) - 1);

            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }

            sum += arr[high];
            map.put(arr[high], map.getOrDefault(arr[high], 0) + 1);
        }

        return result;
    }
}