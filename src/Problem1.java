import java.util.ArrayList;

public class Problem1 {

    static int[] putEvenFirst(int[] elements) {

        int n = elements.length;
        int lastOdd = -1;
        for (int i = 0; i < n; ++i) {
            if (elements[i] % 2 == 0) {
                while(++lastOdd < i && elements[lastOdd] % 2 == 0);
                if (lastOdd < i) {
                    int aux = elements[i];
                    elements[i] = elements[lastOdd];
                    elements[lastOdd] = aux;
                }
            }
        }
        return elements;
    }

    public static void main(String[] args) {


    }
}
