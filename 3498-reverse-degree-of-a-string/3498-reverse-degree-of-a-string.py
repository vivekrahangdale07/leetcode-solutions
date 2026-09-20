class Solution:
    def reverseDegree(self, s: str) -> int:
        sum = 0
        for i in range(len(s)):
            val = 26 - (ord(s[i]) - ord('a'))
            prod = val*(i+1)
            sum += prod
        return sum

        