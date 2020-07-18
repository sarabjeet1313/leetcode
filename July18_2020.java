// Course Schedule II => classic example of Topological Sorting.


class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] depDegrees = new int[numCourses];  // no of dependencies
        
        HashMap<Integer, List<Integer>> graph = new HashMap<>(); //  graph adjancy list
        
        for(int[] lst : prerequisites){
            int master = lst[1];   // depends on
            int slave = lst[0];    // dependent
            
            depDegrees[slave]++;   // update the dependency
            
            graph.putIfAbsent(master, new ArrayList<>()); // update the graph
            graph.get(master).add(slave);
        }
        
        Queue<Integer> q = new LinkedList();  // queue to maintain nodes with 0 dependency

        for(int i=0; i < numCourses; i++){  
            if(depDegrees[i] == 0){
                q.offer(i);   // fill the queue initially
            }
        }
        
        int[] result = new int[numCourses];  // output
        int counter = 0;
        
        while(! q.isEmpty()){
            int node = q.poll();
            
            result[counter++] = node;    
            
            if(graph.containsKey(node)){    // reduces the dependent nodes by 1 as the depends on node is added to result. 
                for( int course : graph.get(node)) {
                    if(--depDegrees[course] == 0) {  // if after reduction it comes to 0, then add it to the queue
                        q.offer(course);
                    }
                }
            }
        }
        
        return counter == numCourses ? result : new int[0];   
    }
}
