import java.util.concurrent.locks.ReentrantLock;

class Foo {

    // This value actually insures the order of the function being correct. The lock only assures that we start second()
    // only after first() finishes and so on. It is a bit redundant.
    int value = 0;

    public void getLock() {
        lock.lock();
    }

    public void releaseLock() {
        lock.unlock();
    }

    ReentrantLock lock;
    Foo() {}

    void first() {
        getLock();
        if (value!= 0) {
            throw new RuntimeException();
        }
        print();
        value = 1;
        releaseLock();
    }

    void second() {
        getLock();
        if (value != 1) {
            throw new RuntimeException();
        }
        print();
        value = 2;
        releaseLock();
    }
    void third() {
        getLock();
        if (value != 2) {
            throw new RuntimeException();
        }
        print();
        releaseLock();
    }

    private void print() {
        System.out.println(value);
    }
}


