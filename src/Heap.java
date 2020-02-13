import java.util.ArrayList;
import java.util.Collections;

public class Heap<T extends Comparable<T>> { //tri par tas
    public Heap() {}

    public void applyTo(ArrayList<T> list) {
        for(int i = list.size()/2; i >= 0; i--) heapify(list, i, list.size()-1);

        for(int i = list.size()-1; i > 0; i--){
            Collections.swap(list, 0, i);
            heapify(list, 0, i-1);
        }
    }

    public void heapify(ArrayList<T> list, int n, int i) {
        int lim = 2 * n;
        while (lim <= i) {
            if (lim < i && list.get(lim).compareTo(list.get(lim + 1)) < 0) lim++;
            else if (list.get(n).compareTo(list.get(lim)) < 0) {
                Collections.swap(list, n, lim);
                n = lim;
                lim = 2 * n;
            }
            else break;
        }
    }
}
