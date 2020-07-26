// Add digits to get number in single digit (eezy beezy). just try get number divisible by 9.



class Solution {
    public int addDigits(int num) {
        
        if(num < 10) return num;
        
        int q = num/10;
        int r = num%10;
        
        int sum = q + r;
      
        if(sum % 9 == 0){
            return 9;
        } 
        else {
            return sum % 9;
        } 
    }
}
