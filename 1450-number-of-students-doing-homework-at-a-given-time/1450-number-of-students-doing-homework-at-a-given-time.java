class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        int n = startTime.length;
        for(int i=0; i<n; i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime) cnt++;
        }
        return cnt;
    }
}