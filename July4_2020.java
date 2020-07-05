// Find Nth Ugly Number => keep track if idx2, idx3, id5 and increment them apt. 

class Solution {
    public int nthUglyNumber(int n) {
        
        int ugly[] = new int[n];
        int idx2 = 0;
        int idx3 = 0;
        int idx5 = 0;
        int count = 1;
        ugly[0] = 1;
        
        while(count < n) {
            
            int val2 = ugly[idx2]*2;
            int val3 = ugly[idx3]*3;
            int val5 = ugly[idx5]*5;
            
            int min_val = Math.min(val2, Math.min(val3,val5));
            
            if(min_val == val2) idx2++;
            if(min_val == val3) idx3++;
            if(min_val == val5) idx5++;
            ugly[count++] = min_val;
        }  
        return ugly[n-1];
    }
}
