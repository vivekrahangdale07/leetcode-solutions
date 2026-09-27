class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                st.push(str.length());
            else if (ch == ')') {
                int start = st.pop();
                reverse(start, str.length() - 1, str);
            } else
                str.append(ch);
        }
        return str.toString();
    }

    public void reverse(int start, int end, StringBuilder str) {
        while (start < end) {
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);

            start++;
            end--;
        }
    }
}