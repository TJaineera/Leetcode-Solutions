/**
 * Title: implement-stack-using-queues
 * Slug: implement-stack-using-queues
 * URL: https://leetcode.com/problems/implement-stack-using-queues/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:43:04.611Z
 */

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    // Push element onto stack
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        // Rotate the queue to move the new element to the front
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }
    
    // Remove the top element
    public int pop() {
        return queue.poll();
    }
    
    // Get the top element
    public int top() {
        return queue.peek();
    }
    
    // Check if stack is empty
    public boolean empty() {
        return queue.isEmpty();
    }
}
