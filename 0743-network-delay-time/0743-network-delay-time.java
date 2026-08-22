import java.util.*;

class Solution {
    class Pair {
        int node, wt;

        Pair(int wt, int node) {
            this.wt = wt;
            this.node = node;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new Pair(wt, v));
        }
        int[] dis = new int[n + 1];
        Arrays.fill(dis, (int) 1e9);
        dis[k] = 0;
        PriorityQueue<Pair> pq =
            new PriorityQueue<>((x, y) -> x.wt - y.wt);

        pq.add(new Pair(0, k));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            int wgt = curr.wt;

            for (Pair edge : adj.get(node)) {

                int next = edge.node;
                int dist = edge.wt;

                if (wgt + dist < dis[next]) {
                    dis[next] = wgt + dist;
                    pq.add(new Pair(dis[next], next));
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (dis[i] == (int) 1e9) {
                return -1;
            }
            max = Math.max(max, dis[i]);
        }
        return max;
    }
}