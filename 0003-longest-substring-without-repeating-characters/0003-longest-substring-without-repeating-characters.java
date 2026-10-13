class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     HashSet<Character> set = new HashSet<>();
    //     int i = 0 , j = 0 , maxLen = 0;
    //     while( j <s.length()){
    //         char ch = s.charAt(j);
    //         if(!set.contains(ch)){
    //             set.add(ch);
    //             j++;
    //         }
    //         else{
    //             int len = j-i;
    //             maxLen = Math.max(maxLen,len);
    //             while(s.charAt(i) != s.charAt(j)){
    //                 set.remove(s.charAt(i));
    //                 i++;
    //             }
    //             i++;
    //             j++;
    //         }
    //     }
    //     int len = j-i;
    //     maxLen = Math.max(maxLen,len);
    //     return maxLen;
    // }

    // public int lengthOfLongestSubstring(String s) {
    //     HashMap<Character, Integer> map = new HashMap<>();
    //     int i = 0, maxLen = 0;

    //     for (int j = 0; j < s.length(); j++) {
    //         char ch = s.charAt(j);

    //         if (map.containsKey(ch)) {
    //             // i ko peeche jane se bachane ke liye max
    //             i = Math.max(i, map.get(ch) + 1);
    //         }

    //         map.put(ch, j);                 // latest index store
    //         maxLen = Math.max(maxLen, j - i + 1);
    //     }

    //     return maxLen;
    // }

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int high=0; high<n; high++){
            map.put(arr[high],map.getOrDefault(arr[high],0)+1);

            int k = high - low + 1;
            while(map.size()<k){
                map.put(arr[low],map.get(arr[low])-1);
                if(map.get(arr[low]) == 0) map.remove(arr[low]);
                low++;
                k = high - low + 1;
            }
            if(map.size() == k){
                int len = high - low + 1;
                maxLen = Math.max(maxLen,len);
            }
        }
        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }
}