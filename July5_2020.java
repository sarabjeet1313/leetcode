
// hamming distance, find xor among elements and check the set bit.

class Solution {
    public int hammingDistance(int x, int y) {
        
        int xorResult = x ^ y;
        int setBits = 0;
        while(xorResult > 0) {
            setBits += xorResult & 1;
            xorResult >>= 1; 
        }
        return setBits;   
    }
}
