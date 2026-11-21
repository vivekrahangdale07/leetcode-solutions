class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int left = 0 , right = arr.length-1;
        int boats = 0;
        while(left<=right){
            int underlimit = arr[left] + arr[right];
            if(underlimit <= limit) {
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}