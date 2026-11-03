class Solution {
    public int minMoves(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr) {
            max = Math.max(max, num);
            sum += num;
        }

        return max * arr.length - sum;
    }
}
