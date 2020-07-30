// Word Break II => Memoization and Recursion over substrings


class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict, new HashMap<String, List<String>>());
    }
    
    public List<String> helper(String s, List<String> wordDict, Map<String, List<String>> memo) {
        
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        
        List<String> results = new ArrayList<>();
        
        // base case
        if(s.length() == 0) {
            results.add("");
            return results;
        }
        
        for(String word : wordDict) {
            
            if(s.startsWith(word)){
                String subString = s.substring(word.length());
                List<String> subStrings = helper(subString, wordDict, memo);
                System.out.println(subStrings);
                
                for(String sub : subStrings) {
                    String space = sub.isEmpty() ? "" : " ";
                    results.add(word + space + sub);
                } 
            }
        }
        memo.put(s, results);
        return results;  
    }
}
