class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2];
        for(int i = 0; i < n-2; i++){
            if (i > 0 && arr[i] == arr[i-1]) continue;
            int left = i+1 , right = n-1;
            while(left<right){
                int currSum = arr[i] + arr[left] + arr[right];
                if(Math.abs(closestSum-target) > Math.abs(currSum-target)) closestSum = currSum;
                if(currSum == target) return currSum;
                else if(currSum < target) left++;
                else right--;
            }
        }
        return closestSum;
    }
}