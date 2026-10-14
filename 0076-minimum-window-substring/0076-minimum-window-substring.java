class Solution {
    public String minWindow(String s, String t) {
        // empty strings
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] have = new int[128];
        int[] needed = new int[128];
        int low = 0;
        int ans = Integer.MAX_VALUE;
        int start = 0;

        for(int i=0; i<t.length(); i++){
            needed[t.charAt(i)]++;
        }

        for(int high = 0; high<n; high++){
            have[arr[high]]++;
            while(helper(have,needed)){
                int len = high-low+1;
                if(ans>len) {
                    ans = len;
                    start = low;
                }
                have[arr[low]]--;
                low++;
            }
        }
        return ans == Integer.MAX_VALUE ? "" : s.substring(start, start + ans);
    }

    public boolean helper(int[] have, int[] needed){
        for(int i=0; i<have.length; i++){
        if(have[i] < needed[i]) return false;
        }
        return true;
        
    }
}