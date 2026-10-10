class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        if (k == 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == 0 && arr[i - 1] == 0)
                    return true;
            }
            return false;
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2)
                    return true;
            }

            else
                map.put(rem, i);
        }
        return false;
    }
}
