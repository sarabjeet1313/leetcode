// classic example of recursion and backtracking - All paths from source to target


List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        getPaths(result, list, graph, 0);
        return result;
    }
    private void getPaths(List<List<Integer>> result, List<Integer> list, int[][] graph, int st) {
        if (st == graph.length -1) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < graph[st].length; i++) {
            list.add(graph[st][i]);
            getPaths(result, list, graph, graph[st][i]);
            list.remove(list.size() - 1); // backtracks
        }
