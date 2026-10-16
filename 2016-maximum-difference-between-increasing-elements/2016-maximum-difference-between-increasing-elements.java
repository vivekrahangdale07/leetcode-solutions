class Solution {
    public int maximumDifference(int[] arr) {
        int min = arr[0];
        int maxDiff = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) maxDiff = Math.max(maxDiff, arr[i] - min);
            else min = arr[i];
        }

        return maxDiff;
    }
}