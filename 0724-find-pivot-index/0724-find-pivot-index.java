class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        int prefSum = 0;
        for(int i = 0; i<arr.length; i++) {
            int suffSum = sum - prefSum - arr[i];
            if(prefSum == suffSum) return i;
            prefSum += arr[i];
        }
        return -1;
    }
}