class Solution {
    // public char nextGreatestLetter(char[] arr, char target) {
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         if(arr[i] > target) return arr[i];
    //     }
    //     return arr[0];
    // }

    public char nextGreatestLetter(char[] arr, char target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) low = mid + 1;
            else high = mid - 1;
        }

        return arr[low % n];
    }
}