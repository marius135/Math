// import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;


class MyQueueTest {
    @Test
    void reverseOnce() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.push(4);
        queue.push(6);
        assertTrue(queue.pop() == 4);
        assertTrue(queue.pop() == 6);
    }

    @Test
    void reverseTwice() {

        MyQueue<Integer> queue = new MyQueue<>();
        queue.push(4);
        // first reverse
        assertTrue(queue.pop() == 4);

        queue.push(6);
        queue.push(1);
        // second reverse
        assertTrue(queue.pop() == 6);
        assertTrue(queue.pop() == 1);
    }

    @Test
    void testSize() {
        MyQueue<Integer> queue = new MyQueue<>();
        assertTrue(queue.empty());
        queue.push(4);
        assertTrue(queue.size() == 1);
        queue.push(6);
        assertTrue(queue.size() == 2);
        queue.pop();
        assertTrue(queue.size() == 1);
        queue.pop();
        assertTrue(queue.empty());
        System.out.println("All ok");
    }

    @Test
    void throwWhenEmptyAndPop() {

        MyQueue<Integer> queue = new MyQueue<>();
        assertThrows(NoSuchElementException.class, queue::pop);
    }

}
