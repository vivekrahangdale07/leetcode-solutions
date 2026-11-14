class Solution {
    public boolean isSameAfterReversals(int num) {
        // int original = num;
        // int rev = 0;
        // while(num > 0){
        //     int digit = num % 10;
        //     rev = rev*10 + digit;
        //     num /= 10;
        // }
        // int doubleRev = 0;
        // while(rev > 0){
        //     int digit = rev % 10;
        //     doubleRev = doubleRev*10 + digit;
        //     rev /= 10;
        // }
        // if(doubleRev != original) return false;
        // return true;

         if (num != 0 && num % 10 == 0) {
            return false;
        }
        return true;
    }
}