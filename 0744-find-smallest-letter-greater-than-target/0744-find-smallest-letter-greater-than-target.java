class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] > target) return arr[i];
        }
        return arr[0];
    }
}