class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0 ; i < s.length() ; i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                deque.push(c); 
            }

            else {
               if (deque.isEmpty()) return false;

                char top = deque.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}