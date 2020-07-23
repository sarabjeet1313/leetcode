// single number - get numbers occuring only once .

class Solution {
    public int[] singleNumber(int[] nums) {

        int c = 0;
        for (int num : nums) {
            c ^= num;
        }
        
        // get the lowest "1" bit of C
        c &= -c;
        // result[0], result[1] would be the XOR results of Group A(having that bit not set) and Group B (having that bit set)
        int[] result = new int[2];
        for (int num : nums) {
            if ((num & c) == 0) {
                result[1] ^= num;
            }
            else {
                result[0] ^= num;
            }
        }
        return result;
    }
}
