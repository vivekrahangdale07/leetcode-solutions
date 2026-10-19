class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){            // T.C = O(nlogn) 
            if(nums[i] == target) ans.add(i);        // S.C = O(n)
        }
        return ans;
    }
}