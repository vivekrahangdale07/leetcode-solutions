class Solution:
    def nextGreatestLetter(self, arr: list[str], target: str) -> str:
        n = len(arr)
        low = 0
        high = n - 1

        while low <= high:
            mid = low + (high - low) // 2
            if arr[mid] <= target:
                 low = mid + 1
            else:
                 high = mid - 1
        

        return arr[low % n]