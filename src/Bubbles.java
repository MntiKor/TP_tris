import java.util.ArrayList;
import java.util.Collections;

public class Bubbles { //tri par bulles

    public Bubbles() {}

    public void applyTo(ArrayList<? extends Comparable> list) {

        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j + 1).compareTo(list.get(j)) < 0) {
                    Collections.swap(list, j, j+1);
                }
            }
        }
    }
}
