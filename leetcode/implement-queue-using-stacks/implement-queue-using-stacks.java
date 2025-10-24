/**
 * Title: implement-queue-using-stacks
 * Slug: implement-queue-using-stacks
 * URL: https://leetcode.com/problems/implement-queue-using-stacks/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:43:52.422Z
 */

class MyQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public MyQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }
    
    // Push element to the back of the queue
    public void push(int x) {
        stackPush.push(x);
    }
    
    // Remove the element from the front
    public int pop() {
        movePushToPop();
        return stackPop.pop();
    }
    
    // Get the front element
    public int peek() {
        movePushToPop();
        return stackPop.peek();
    }
    
    // Check if the queue is empty
    public boolean empty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
    
    // Helper: move elements from push stack to pop stack if pop stack is empty
    private void movePushToPop() {
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
    }
}
