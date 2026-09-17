class Pair implements Comparable<Pair> {
    int score;
    int originalindex;

    Pair(int score, int originalindex) {
        this.score = score;
        this.originalindex = originalindex;
    }
    public int compareTo(Pair p){
        if(this.score == p.score) return this.originalindex - p.originalindex;
        return this.score - p.score;
    }
}

class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<score.length; i++) pq.add(new Pair(score[i],i));
        
        String[] ans = new String[score.length];
        int rank = 1;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();
            int index = current.originalindex;

            if (rank == 1)  ans[index] = "Gold Medal";   
            else if (rank == 2) ans[index] = "Silver Medal";  
            else if (rank == 3) ans[index] = "Bronze Medal";   
            else ans[index] = String.valueOf(rank);
            rank++;
        }
        return ans;
    }
}
