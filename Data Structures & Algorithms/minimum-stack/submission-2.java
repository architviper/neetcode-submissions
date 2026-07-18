class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    //int min;

    public MinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
      //min = Integer.MAX_VALUE;
      minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.push(val);
        if (val <= minStack.peek()) {
            minStack.push(val);
        }
        //min = Math.min(min, val);
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return  minStack.peek();
    }
}
