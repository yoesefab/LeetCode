class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int l1 = word1.length() ; 
        int l2 = word2.length() ;
        int size = l1 > l2 ? l2 : l1;

        String word1s = word1.substring(0 , size);
        String word2s = word2.substring(0 , size); 


        for (int i = 0 ; i < size ; i++) {
            s.append(word1s.charAt(i));
            s.append(word2s.charAt(i));
        }

        s.append(word1.substring(size));
        s.append(word2.substring(size));
        
        return s.toString() ; 
    } 

}