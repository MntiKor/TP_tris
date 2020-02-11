import java.util.ArrayList;

public class Fusion { // tri par fusion

	public Fusion() {}

	public void applyTo(ArrayList<? extends Comparable> list) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			if (i < list.size()/2) list1.add(list.get(i));
			else list2.add(list.get(i));
		}


		list = doFusion(list1, list2);

	}

	public ArrayList doFusion(ArrayList<? extends Comparable> list1, ArrayList<? extends Comparable> list2) {
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		if (list1.size() == 0) return list2;
		if (list2.size() == 0) return list1;
		ArrayList ret = new ArrayList();
		if (list1.get(0).compareTo(list2.get(0)) <= 0) {
			ret.add(list1.get(0));
			list1.remove(0);
			ret.addAll(doFusion(list1, list2));
		}

		else {
			ret.add(list2.get(0));
			list2.remove(0);
			ret.addAll(doFusion(list1, list2));
		}
		System.out.println(ret.toString());
		return ret;
	}
}
