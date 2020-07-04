// Prison cells after N days => find the cycle 

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {     
        Set<String> set = new HashSet<>();
        int size = 0;
        boolean flag = false;
        for(int i = 0; i < N; i++){
            int[] nextState = new int[8];
            for(int j = 1; j < 7; j++){
                nextState[j] = (cells[j - 1] == cells[j + 1] ? 1 : 0);
            }
            String s = Arrays.toString(nextState);
            if(!set.contains(s)){
                set.add(s);
                size++;
            }
            else{
                flag = true;
                break;
            }
            cells = nextState;
        }
        if(flag){
            N = N % size;
            for(int i = 0; i < N; i++){
                int[] nextState = new int[8];
                for(int j = 1; j < 7; j++){
                    nextState[j] = (cells[j - 1] == cells[j + 1] ? 1 : 0);
                }
                cells = nextState;
            }
        }
        return cells; 
    }
}
