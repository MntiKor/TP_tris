import java.util.ArrayList;
import java.util.Collections;

public class Quick<T extends Comparable<T>> { //tri rapide partition du drapeau

    public Quick() {}

    public int partition(ArrayList<T> list, int start, int end) {
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            int comp = list.get(j).compareTo(list.get(end));
            if (comp <= 0){ i++; Collections.swap(list, i, j); }
        }
        Collections.swap(list, i+1, end);
        return i+1;
    }

    public void applyTo(ArrayList<T> list, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(list, begin, end);

            applyTo(list, begin, partitionIndex-1);
            applyTo(list, partitionIndex+1, end);
        }
    }
}