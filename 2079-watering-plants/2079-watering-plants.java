class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int water = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > water) {
                steps += 2 * i;
                water = capacity;
            }

            water -= plants[i];
            steps++;
        }
        return steps;
    }
}