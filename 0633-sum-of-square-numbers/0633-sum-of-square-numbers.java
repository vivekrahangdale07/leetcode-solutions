class Solution {
    public boolean judgeSquareSum(int c) {
        if (c <= 2) return true;

        long i = 0;
        long j = (int) Math.sqrt(c);

        while (i <= j) {
            long sum = (i * i) + (j * j);

            if (sum == c)
                return true;
            else if (sum < c)
                i++;
            else
                j--;
        }

        return false;
    }
}