class Solution {
    public int smallestIndex(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int sum = 0;
            while(num>0){
                int digit = num%10;
                sum += digit;
                num /= 10;
            }
            if(sum == i) ans = Math.min(ans,i);
        }
        return (ans != Integer.MAX_VALUE) ?  ans : -1;
    }
}