class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        char[] arr = s2.toCharArray();
        int n = arr.length;
        int low = 0;
        int high = s1.length() - 1;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++)
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);

        for (int i = low; i <= high; i++)
            map2.put(arr[i], map2.getOrDefault(arr[i], 0) + 1);

        while (high < n) {
            if (map1.equals(map2)) return true;
            if(high == n-1) break;
            low++;
            high++;

            // Remove outgoing element
            char key = arr[low-1];

            map2.put(key, map2.get(key) - 1);

            if (map2.get(key) == 0) {
                map2.remove(key);
            }

            // Add incoming element
            char newKey = arr[high];

            map2.put(newKey, map2.getOrDefault(newKey, 0) + 1);
        }
        return false;
    }
}