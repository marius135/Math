import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
    @Test
    void putEvenFirstSimpleReverse() {

        Problem1 problem = new Problem1();
        int [] myArray = {3, 4};
        myArray = Problem1.putEvenFirst(myArray);

        assertTrue(myArray.length == 2);
        assertTrue(myArray[0] == 4);
        assertTrue(myArray[1] == 3);
    }

    @Test
    void putEvenFirstNoReverse() {
        Problem1 problem = new Problem1();
        int [] myArray = {4, 3};
        myArray = Problem1.putEvenFirst(myArray);

        assertTrue(myArray.length == 2);
        assertTrue(myArray[0] == 4);
        assertTrue(myArray[1] == 3);
    }

}