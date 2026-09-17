class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder st = new StringBuilder();
            int sum = 0;
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                cnt++;

                if (cnt == k || i == s.length() - 1) {
                    st.append(sum);
                    sum = 0;
                    cnt = 0;
                }
            }

            s = st.toString();
        }

        return s;
    }
}