package offer;

import java.util.Stack;

/**
 * @author:菲你莫属123
 * @description:
 **/
public class TwoStackToQueuel {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void addQueuel(int data) {
        stack1.push(data);
    }

    public int getQueuel() {
        if (stack2.empty()) {
            throw new RuntimeException("Query is empty");
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}


