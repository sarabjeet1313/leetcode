// Plus one - add one starting from last iteration or replace it with 0

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] reset = new int[digits.length + 1];
            reset[0] = 1;
            return reset;
        }
        return digits;
    }

}

