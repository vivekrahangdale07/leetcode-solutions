class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int low = 0;
        int maxFreq = 0;
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int high = 0; high<n; high++){
            map.put(arr[high],map.getOrDefault(arr[high],0)+1);
            maxFreq = Math.max(maxFreq,map.get(arr[high]));
            int len = high - low + 1;
            while(len-maxFreq > k){
                map.put(arr[low],map.get(arr[low])-1);
                low++;
                len = high - low + 1;
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}