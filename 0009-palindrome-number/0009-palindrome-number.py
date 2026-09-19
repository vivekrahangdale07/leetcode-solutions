class Solution:
    def isPalindrome(self, x: int) -> bool:
        original = x
        r = 0
        while x>0:
            r*=10
            r+=x%10
            x//=10
        
        if original == r:
            return True 
        else:
            return  False

        