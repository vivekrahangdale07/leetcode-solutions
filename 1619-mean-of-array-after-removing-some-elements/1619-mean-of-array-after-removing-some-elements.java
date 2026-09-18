class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int fivePer = n/20;
        int sum = 0;
        for(int i=fivePer; i<n-fivePer; i++) sum += arr[i];
        double mean = (double)sum/(n-(fivePer*2));
        return mean;
    }
}