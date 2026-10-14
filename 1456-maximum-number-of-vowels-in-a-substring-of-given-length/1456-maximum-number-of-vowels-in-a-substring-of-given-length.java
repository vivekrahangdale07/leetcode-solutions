class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int low = 0;
        int high = k - 1;
        int vowels = 0;
        for (int i = low; i <= high; i++) {
            if (isVowel(arr[i])) vowels++;
        }

        int maxVowels = vowels;
        while (high < n-1) {
            if (isVowel(arr[low])) vowels--;

            low++;
            high++;

            if (isVowel(arr[high])) vowels++;
            maxVowels = Math.max(maxVowels, vowels);
        }
        return maxVowels;
    }

    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}