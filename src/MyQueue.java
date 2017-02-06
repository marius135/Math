import java.util.*;

/* We push elements in the first stack. When a pop command comms we pop everything from the first stack and push it to
the second stack. The second stack will now have the elements in the right order. While there are elements in the second
 stack we pop from it. When the stack is empty we move the first stack here again.
 We always push to the first stack.
  */
class MyQueue<T> {

    Stack<T> first = new Stack<T>();
    Stack<T> second = new Stack<T>();

    int size() {
        return first.size() + second.size();
    }

    void push(T t) {
        first.push(t);
    }

    T pop() {
        if (second.empty()) {
            while (!first.empty()) {
                second.push(first.pop());
            }
        }
        if (second.empty()) {
            // should normally through EmptyQueueException.
            throw new NoSuchElementException();
        }
        return second.pop();

    }

    public boolean empty() {
        return size() == 0;
    }
}