class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j])  return nums1[i];
            else if (nums1[i] < nums2[j])  i++;
            else j++;
        }
        return -1;
    }   
    // public int getCommon(int[] nums1, int[] nums2) {
    //     int m = nums1.length , n = nums2.length;
    //     HashSet<Integer> set1 = new HashSet<>();
    //     HashSet<Integer> set2 = new HashSet<>();
    //     for(int i=0; i<m; i++) set1.add(nums1[i]);
    //     for(int i=0; i<n; i++) set2.add(nums2[i]);
    //     int min = Integer.MAX_VALUE;
    //     for(int ele : set1){
    //         if(set2.contains(ele)) min = Math.min(min,ele);
    //     }
    //     return (min == Integer.MAX_VALUE ? -1 : min);
    // }
}