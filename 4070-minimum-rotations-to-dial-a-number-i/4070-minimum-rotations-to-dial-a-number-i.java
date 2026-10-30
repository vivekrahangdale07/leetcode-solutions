class Solution {
    public int minRotations(String s) {
        int sum = 0;
        sum += Math.min(Math.abs(0-(s.charAt(0)-'0')),10-Math.abs(0-(s.charAt(0)-'0')));
        for(int i=1; i<s.length(); i++){
            int a = s.charAt(i-1) - '0';
            int b = s.charAt(i) - '0';
            int d = Math.abs(a-b);
            d = Math.min(d,10-d);
            sum += d;
        }
        return sum;
    }
}