class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int ans = 0 ;
        if (tokens.length == 1 ) return Integer.parseInt(tokens[0]);

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                 int result = 0;
                if(!stack.isEmpty() ) {
                    int b = stack.pop();
                    int a = stack.pop();
                     if (s.equals("+")) {
                        result = a + b;
                    } else if (s.equals("-")) {
                        result = a - b;
                    } else if (s.equals("*")) {
                        result = a * b;
                    } else if (s.equals("/")) {
                        result = a / b;
                    } 
                    stack.push(result);
                    ans = result;
                }

            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return ans;
    }
}
