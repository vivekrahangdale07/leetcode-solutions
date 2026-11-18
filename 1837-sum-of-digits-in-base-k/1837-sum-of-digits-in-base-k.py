class Solution:
    def sumBase(self, n: int, k: int) -> int:
        ans=0
        while n>0:
            a=n%k
            ans+=a
            n=n//k
        return ans