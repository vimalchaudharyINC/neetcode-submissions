class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> hs = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            pq.offer(entry);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Get top k
        int[] arr = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            arr[i] = pq.poll().getKey();
        }

        return arr;
    }
}
