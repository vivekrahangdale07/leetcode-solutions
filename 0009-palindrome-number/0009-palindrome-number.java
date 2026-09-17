class Solution {
    public boolean isPalindrome(int k) {
        int original = k;
        int r = 0;
        while(k>0){
            r*=10;
            r+=k%10;
            k/=10;
        }
        if(r==original) return true;
        else return false;
    }
}