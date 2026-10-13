class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int low = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int high=0; high<n; high++){
            map.put(arr[high],map.getOrDefault(arr[high],0)+1);
            
            while(map.size()>2){
                map.put(arr[low] , map.get(arr[low])-1);
                if(map.get(arr[low]) == 0) map.remove(arr[low]);
                low++;
            }

                int len = high-low+1;
                maxLen = Math.max(maxLen,len);
            
        }
        return maxLen == 0 ? -1 : maxLen;
    }
}