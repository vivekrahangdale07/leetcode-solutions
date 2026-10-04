class Solution {
    public int[] sortedSquares(int[] arr) {
         int n = arr.length;
         int[] ans = new int[n];
        // for (int i = 0; i < n; i++) {
        //     ans[i] = arr[i]*arr[i];
        // }
        // Arrays.sort(ans);
        // return ans;
        int i = 0 , j = n-1 , k = n-1;
        while(i<=j){
            int a = arr[i]*arr[i];
            int b = arr[j]*arr[j];
            if(a > b){
                ans[k] = a;
                i++;
            }
            else{
                ans[k] = b;
                j--;
            }
            k--;
        }
        return ans;
    }
}