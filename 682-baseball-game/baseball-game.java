class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int last;     
        int secondLast ;
        for (int i = 0 ; i < operations.length ; i++) {
            switch(operations[i]) {
                case "+":
                    last = stack.peek();     
                    secondLast = stack.get(stack.size() - 2);
                    stack.push(last + secondLast);
                break;
                case "D":
                    last = stack.peek();     
                    stack.push(last * 2);  
                break;
                case "C":
                    stack.pop();     
                break;
                default: stack.push(Integer.parseInt(operations[i])); 
        }
        }
                int sum = 0 ; 
        for (int j = 0; j < stack.size(); j++) {
            sum += stack.get(j);
        }
        return sum;
    }
}