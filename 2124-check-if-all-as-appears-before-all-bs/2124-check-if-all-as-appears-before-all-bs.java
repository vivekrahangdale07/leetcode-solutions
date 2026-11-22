class Solution {
    public boolean checkString(String s) {
        for(int i=0; i<s.length()-1; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1=='b' && ch2 == 'a') return false;
        }
        return true;
    }
}