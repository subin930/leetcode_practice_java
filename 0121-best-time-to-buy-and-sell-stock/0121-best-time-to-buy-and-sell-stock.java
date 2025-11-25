import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        int current = prices[0];

        for(int i = 1; i < prices.length; ++i) {
            int temp = prices[i] - current;

            if(temp < 0) {
                current = prices[i];
                continue;
            }
            
            pq.offer(temp);
        }

        return (pq.isEmpty()) ? 0 : pq.peek();
    }
}