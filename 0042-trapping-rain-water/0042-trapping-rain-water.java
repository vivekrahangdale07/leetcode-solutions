// class Solution {
//     public int trap(int[] arr) {
//         int n = arr.length;
//         int[] leftMax = new int[n];
//         leftMax[0] = arr[0];

//         for(int i = 1; i<n; i++){
//             leftMax[i] = Math.max(arr[i] , leftMax[i-1]);
//         }
//         int[] rightMax = new int[n];
//         rightMax[n-1] = arr[n-1];

//         for(int i = n-2; i>=0; i--){
//             rightMax[i] = Math.max(arr[i] , rightMax[i+1]);
//         }

//         int[] ans = new int[n];

//         for(int i = 0; i<n; i++){
//             ans[i] = Math.min(leftMax[i] , rightMax[i]) - arr[i];
//         }
         
//          int sum = 0;
//         for(int i = 0; i<ans.length; i++){
//             sum += ans[i]; 
//         }
//         return sum;
//     }
// }



class Solution {
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int water = 0;

        for (int i = 0; i < n; i++) {

            // Jab tak current height stack ke top se badi ho
            while (!st.isEmpty() && height[i] > height[st.peek()]) {

                int bottom = st.pop();  // beech wala element

                if (st.isEmpty()) break; // left boundary nahi bachhi

                int left = st.peek();   // left boundary index

                int width = i - left - 1; // width between left and right
                int boundedHeight = Math.min(height[left], height[i]) - height[bottom];

                water += boundedHeight * width;
            }

            st.push(i);
        }

        return water;
    }
}
