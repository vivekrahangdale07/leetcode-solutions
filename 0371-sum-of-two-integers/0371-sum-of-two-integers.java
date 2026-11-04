class Solution {
    // public int getSum(int a, int b) {
    //     return a+b;
    // }


    public int getSum(int a, int b) {
    while (a != 0) {
        int carry = a & b;
        b = a ^ b;
        a = carry << 1;
    }
    return b;
}

}