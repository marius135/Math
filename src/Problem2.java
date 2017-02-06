

import static java.lang.Thread.sleep;

public class Problem2 {
    public static void main(String[] args) {

        class MyRunnable implements Runnable{
            private final int threadnumber;
            Foo foo;

            MyRunnable(int threadnumber, Foo foo){
                this.threadnumber = threadnumber;
                this.foo = foo;
            }

            public void run() {
                try {
                    if (threadnumber == 0) {
                        sleep(5000);
                        while (foo.value != 0) {
                            sleep(1000);
                        }
                        foo.first();
                    }

                    if (threadnumber == 1) {
                        sleep(3000);
                        while (foo.value != 1) {
                            sleep(1000);
                        }
                        foo.second();
                    }
                    if (threadnumber == 2) {
                        while (foo.value != 2) {
                            sleep(1000);
                        }
                        foo.third();
                    }
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        Foo foo = new Foo();

        for(int i=0; i < 3; i++){
            System.out.println("thread: " + i);
            new Thread(new MyRunnable(i, foo)).start();
        }
    }
}
