import java.util.*;

public class MyStack {

    protected java.util.List hand = new ArrayList();
    int top;

    MyStack() {
        top = 0;
    }

    void push(Card card) {

        hand.add(top, card);

    }

    void pop() {

        hand.remove(top);

    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

}
