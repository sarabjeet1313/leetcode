// reverse words - ez-bz



class Solution {
    public String reverseWords(String s) {
        
        String cleanWord = s.replaceAll("\\s+" , " ");
        String[] spltArray = cleanWord.split("\\s+");
        
       List<String> splt = Arrays.asList(spltArray);
        Collections.reverse(splt);
        
        String finalString = "";
        for(int i=0; i<splt.size(); i++) {
            finalString += " " + splt.get(i);           
        }      
        return finalString.trim(); 
    }
}
