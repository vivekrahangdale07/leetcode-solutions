class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0 , high = n-1 , mid = 0;
        while (mid <= high) {
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;                 // DUTCH NATIONAL FLAG ALGORITHM
                low++;
                mid++;
            }  
            else if(arr[mid] == 1) mid++;         // OPTIMAL APPROACH

           else if(arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}

// class Solution {
//     public void sortColors(int[] arr) {
//         int c0 = 0 , c1 = 0 , c2 = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == 0) c0++;                 // BETTER APPROACH
//             else if(arr[i] == 1) c1++;
//             else c2++;
//         }
//         int idx = 0;
//         for (int i = 0; i < c0; i++) arr[idx++] = 0;
//         for (int i = 0; i < c1; i++) arr[idx++] = 1;
//         for (int i = 0; i < c2; i++) arr[idx++] = 2;
//     }
// }

// class Solution {
//      public void sortColors(int[] arr) {
//       Arrays.sort(arr);                        // FOOLISH WORK
//      }
// }