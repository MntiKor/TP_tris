import java.util.ArrayList;

public class Fusion<T extends Comparable<T>> { // tri par fusion

	public Fusion() {}

	public void applyTo(ArrayList<T> list, int start, int end) {
		int mid;

		if (start < end) {
			mid = (start + end) / 2;
			applyTo(list, start, mid);
			applyTo(list, mid + 1, end);
			doFusion(list, start, mid, end);
		}
	}

	public void doFusion(ArrayList<T> list, int start, int mid, int end) {
		ArrayList<T> old = (ArrayList<T>) list.clone();

		int i1 = start;
		int i2 = mid + 1;
		int i = start;

		while (i1 <= mid && i2 <= end) {
			if (old.get(i1).compareTo(old.get(i2)) <= 0) {
				list.set(i, old.get(i1));
				i1++;
			} else {
				list.set(i, old.get(i2));
				i2++;
			}
			i++;
		}
		if (i <= end) {
			while (i1 <= mid) {
				list.set(i, old.get(i1));
				i1++;
				i++;
			}
			while (i2 <= end) {
				list.set(i, old.get(i2));
				i2++;
				i++;
			}
		}
	}
}
