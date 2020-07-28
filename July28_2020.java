// Task scheduler - just max occurence* n and then move backwards and minus the rest occurences.


class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] freq = new int[26];
        
        for(char task : tasks ) {
            freq[task - 'A']++ ;
        }
        
        Arrays.sort(freq);
        
        int max_freq = freq[25] - 1; // we don't care about the char occuring at the last.
        int empty_slots = max_freq*n;
            
        for(int i=24; i >= 0; i--) {
            empty_slots -= Math.min(freq[i], max_freq);
        }
        
        return empty_slots > 0 ? empty_slots + tasks.length : tasks.length;
        
    }
}
