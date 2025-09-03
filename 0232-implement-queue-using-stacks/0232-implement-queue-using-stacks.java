class MyQueue {
    private stack s1;
    private stack temp;

    public static class stack {
        private int front;
        private int rear;
        private int[] arr;

        public stack() {
            rear = -1;
            front = 0;
            arr = new int[9];
        }
    }
    public MyQueue() {
        s1 = new stack();
        temp = new stack();
    }
    
    public void push(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (empty()) {
            s1.rear++;
            s1.arr[s1.rear] = x;
        } else {
            while (s1.rear != -1) {
                temp.rear++;
                temp.arr[temp.rear] = s1.arr[s1.rear];
                s1.rear--;
            }
            s1.arr[s1.front] = x;
            s1.rear++;
            while (temp.rear != -1) {
                s1.rear++;
                s1.arr[s1.rear] = temp.arr[temp.rear];
                temp.rear--;
            }
        }
    }
    
    public int pop() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = s1.arr[s1.rear];
            s1.rear--;
            return result;
        }
    }
    
    public int peek() {
        if (!empty()) {
            return s1.arr[s1.rear];
        }
        return -1;
    }
    public boolean isFull() {
        if (s1.rear == s1.arr.length - 1) {
            return true;
        }
        return false;
    }
    public boolean empty() {
        if (s1.rear == -1) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */