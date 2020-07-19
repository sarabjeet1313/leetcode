// Add String given in Binary style 



class Solution {
    public String addBinary(String a, String b) {
        
        int lenA = a.length()-1;
        int lenB = b.length()-1;
        int flag = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(lenA >= 0 || lenB >=0) {
            
            int valA = 0;
            int valB = 0;
            
            if(lenA >= 0) {
               valA = a.charAt(lenA) == '0' ? 0 : 1;
                lenA--;
            }
            
            if(lenB >= 0) {
                valB = b.charAt(lenB) == '0' ? 0 : 1;
                lenB--;
            }
            
            int result = valA + valB + flag;
            
            if(result >= 2) {
                sb.append(String.valueOf(result-2));
                flag = 1;
            }
            else {
                sb.append(String.valueOf(result));
                flag = 0;
            }
        }
        
        if(flag == 1){
            sb.append("1");
        }
 
    String finalResult = sb.reverse().toString();
    return finalResult;
     
    }
}
