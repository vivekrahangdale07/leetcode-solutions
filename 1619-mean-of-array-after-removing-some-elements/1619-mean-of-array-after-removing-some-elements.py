class Solution:
    def trimMean(self, arr: list[int]) -> float:
        arr.sort()
        n = len(arr)
        fivePer = n//20
        sum = 0
        for i in range(fivePer,n-fivePer):
            sum = sum + arr[i]
        
        mean = sum/(n-(fivePer*2))
        return mean
        