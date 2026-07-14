class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
         map.put(']', '[');
          map.put(')', '(');

          int n = s.length();
          Stack<Character> st = new Stack<>();

          for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else 
            {
               if (!st.isEmpty() && st.peek() == map.get(ch)) {
                st.pop();
               } else {
                return false;
               }
            }
          }

          if(!st.isEmpty()) {
            return false;
          }
          return true;
    }
}
