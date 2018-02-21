class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    //O(1)
    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);    
    }
    
    //O(n)
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1)
            q2.offer(q1.poll());
        int ret = q1.poll();
        while(!q2.isEmpty())
            q1.offer(q2.poll());
        return ret;
    }
    //O(n)
    /** Get the top element. */
    public int top() {
        while(q1.size()>1)
            q2.offer(q1.poll());
        int ret = q1.poll();
        while(!q2.isEmpty())
            q1.offer(q2.poll());
        q1.offer(ret);
        return ret;
    }
    
    //O(1)
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
