class Solution {
    // public int totalNumbers(int[] digit) {
    //     int count = 0;
    //     for (int i = 0; i < digit.length; i++) {
    //         if (digit[i] == 0) continue;
    //         for (int j = 0; j < digit.length; j++) {
    //             for (int k = 0; k < digit.length; k++) {
    //                 if (i == j || j == k || i == k) continue;

    //                 if (digit[k] % 2 != 0) continue;
    //                 count++;
    //             }
    //         }
    //     }

    //    // duplicate numbers remove karne ke liye
    //     Set<Integer> set = new HashSet<>();

    //     for (int i = 0; i < digit.length; i++) {
    //         if (digit[i] == 0) continue;
    //         for (int j = 0; j < digit.length; j++) {
    //             for (int k = 0; k < digit.length; k++) {
    //                 if (i == j || j == k || i == k) continue;
    //                 if (digit[k] % 2 != 0) continue;
    //                 int num = digit[i] * 100 + digit[j] * 10 + digit[k];
    //                 set.add(num);
    //             }
    //         }
    //     }

    //     return set.size();
    // }

    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits)
            freq[d]++;

        int count = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 8; c += 2) {

                    if (freq[a] == 0 || freq[b] == 0 || freq[c] == 0)
                        continue;

                    int[] need = new int[10];
                    need[a]++;
                    need[b]++;
                    need[c]++;

                    boolean possible = true;

                    for (int d = 0; d <= 9; d++) {
                        if (need[d] > freq[d]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible)
                        count++;
                }
            }
        }

        return count;
    }
}