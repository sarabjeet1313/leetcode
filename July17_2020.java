// Check first approach-commented and then next. Main part is maitaining hashmap and getting the k values from reverse. 


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
//         Map<Integer, Integer> countMap = new HashMap<>();
//         int max = 0;
        
//         for(int i=0; i < nums.length; i++) {
//             int freq = countMap.getOrDefault(nums[i],0) + 1;
            
//             countMap.put(nums[i], freq);
            
//             max = Math.max(max, freq);
//         }
        
//         List<Integer>[] bucket = new List[max + 1];
        
//         for(int i : countMap.keySet()) {
//             int freq = countMap.get(i);
            
//             if(bucket[freq] == null){
//                 bucket[freq] = new ArrayList<>();
//             }
            
//             bucket[freq].add(i);
//         }
        
//         List<Integer> result = new ArrayList<>();
//         // int[] result = new int[k];
        
//         for(int j=bucket.length-1; j>=0 && k>0; j--){
//             if(bucket[j] != null) {
//                 List<Integer> lst = bucket[j];
//                 result.addAll(lst);
//                 k -= result.size();
//             }
//         }
//         System.out.println(result);
        
         //count the frequency for each element
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
 
    // create a min heap
    PriorityQueue<Map.Entry<Integer, Integer>> queue 
                  = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
 
    //maintain a heap of size k.
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        queue.offer(entry);
        if (queue.size() > k) {
            queue.poll();
        }
    }
 
    //get all elements from the heap
    List<Integer> result = new ArrayList<>();
    while (queue.size() > 0) {
        result.add(queue.poll().getKey());
    }
 
    //reverse the order
    Collections.reverse(result);
 
    return result.stream().mapToInt(i->i).toArray();
        
    }
}
