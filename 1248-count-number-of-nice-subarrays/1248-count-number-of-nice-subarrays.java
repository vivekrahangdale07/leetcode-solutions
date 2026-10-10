class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int cnt = 0;
        for(int ele : arr){
            if(ele % 2 == 1) sum++;

            cnt += map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}