class Solution {
    // Sieve of Eratosthenes
    public List<Integer> maxPrimes(int n, int s) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        List<Integer> lst = new ArrayList<>();
        long sum = 0;
        int i = 2;
        while (i <= n && sum <= s) {
            if (isPrime[i] == true) {
                for (long j = (long) i * i; j <= n; j += i) isPrime[(int) j] = false;
                sum += i;
                if (sum <= s) lst.add(i);
            }
            i++;
        }
        return lst;
    }
}