class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character , Integer> map1 = new HashMap <>(); 

        for(Character ch : s.toCharArray()) {
            if (map1.containsKey(ch)) { map1.put(ch , map1.get(ch) + 1); }
            else map1.put(ch , 1); 
        }

        HashMap <Character , Integer> map2 = new HashMap <>(); 

        for(Character ch : t.toCharArray()) {
            if (map2.containsKey(ch)) { map2.put(ch , map2.get(ch) + 1); }
            else map2.put(ch , 1); 
        }
      
        return map1.equals(map2) ;
    }
}