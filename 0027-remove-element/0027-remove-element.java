class Solution {
    public int removeElement(int[] arr, int val) {
        int i = 0 , j = arr.length-1;
        while(i<=j){
            if(arr[i] == val){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
           else i++;
        }
        return j+1;
    }
}