class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(int i=0; i<details.length; i++){
            String st = details[i];
            String s = st.substring(11,13);
            int age = Integer.valueOf(s);
            if(age > 60) cnt++;
        }
        return cnt;
    }
}