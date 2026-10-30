class Solution {
    public int minRotations(int n, String s) {
        char[] ch = s.toCharArray();
        // for(int i=0; i<ch.length; i++) System.out.print(ch[i] + " ");

        int k = -1;
        int save = 0;
        
        for(int i=0; i<ch.length; i++) {
            if(i == 0) {
                int curr = ch[i] - '0';
                int nm1 = ch[n-1] - '0';

                int cost1 = 0;
                if(curr <= 5) cost1 = curr;
                else cost1 = 10 - curr;

                int cost2 = 0;
                if(nm1 <= 5) cost2 = nm1;
                else cost2 = 10 - nm1;

                if(cost1 > cost2){
                    save = cost1 - cost2;
                    k = i;
                }
            } 

            else{

                int curr = ch[i] - '0';
                int last = ch[i-1]- '0';

                // last to curr cost
                int d1 = Math.abs(curr - last);
                int cost1 = 0;

                if(d1 <= 5) cost1 = d1;
                else cost1 = (10 - d1);

                // last to n-1 cost 
                int nm1 = ch[n-1] - '0';
                int d2 = Math.abs(last - nm1);
                int cost2 = 0;

                if(d2 <= 5) cost2 = d2;
                else cost2 = (10 - d2);


                if(cost1 > cost2  && save < (cost1 - cost2)) {
                    save = cost1 - cost2;
                    k = i;
                }
            }
        }

        if(k != n-1 && k != -1) reverse(k, ch);
        // for(int i=0; i<ch.length; i++) System.out.print(ch[i] + " ");

        return minRotations(ch);
    }

    public void reverse(int k, char[] ch) {
        int i = k;
        int j = ch.length - 1;

        while(i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++; j--;
        }
    }

        public int minRotations(char ch[]) {
        int ans = 0;
        char c = '0';

        int a = 0;
        int i = 0;

        while(i < ch.length) {
            int target = ch[i] - c;

            int diff = Math.abs(a - target);

            if(diff <= 5) ans += diff;
            else ans += (10 - diff);

            a = target;
            i++;
        }
        
        return ans;
    }
}

