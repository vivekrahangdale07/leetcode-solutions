class Solution:
    def finalPrices(self, prices: list[int]) -> list[int]:
        z=[]
        for i in range(len(prices)):
            for j in range(i+1,len(prices)):
                if prices[j]<=prices[i]:
                    z.append(prices[i]-prices[j])
                    break
            else:
                z.append(prices[i])
        return z