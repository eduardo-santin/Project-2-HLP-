
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

    void peek() {

    }

}
