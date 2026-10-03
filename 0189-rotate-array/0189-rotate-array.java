class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(0,n-1,arr);
        reverse(0,k-1,arr);
        reverse(k,n-1,arr);
    }
    
    public  void reverse(int i, int j, int[] arr){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}