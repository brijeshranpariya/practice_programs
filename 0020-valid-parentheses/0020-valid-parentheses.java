class Solution {
     private int maxSize;
    private char[] stackArray;
    private int top = -1;
    public char pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        }
        return stackArray[top];
    }

    public char top() {
        if (top == -1) {
            return '0';
        } else {
            return stackArray[top];
        }
    }
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        stackArray = new char[s.length()];
        int i = 0;
        while (i < s.length()) {
            System.out.println("character: " + s.charAt(i));
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stackArray[top + 1] = s.charAt(i);
                top++;
            } else {
                if (top == -1) {
                    return false;
                }
                char topElement = top();
                if ((topElement == '(' && s.charAt(i) == ')') || (topElement == '[' && s.charAt(i) == ']')
                        || (topElement == '{' && s.charAt(i) == '}')) {
                    pop();
                    top--;
                } else {
                    return false;
                }
            }
            i++;
        }
         if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}