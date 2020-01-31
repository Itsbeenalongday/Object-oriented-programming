package Q5;

import java.util.ArrayList;

public class PairTest {

	public static void main(String[] args) {

		Pair<Integer, String> pair1 = new Pair<>(1, "one");
		Pair<Integer, String> pair2 = new Pair<>(2, "two");
		Pair<Integer, String> pair3 = new Pair<>(3, "three");

		ArrayList<Pair<Integer, String>> list = new ArrayList<>();
		list.add(pair1);
		list.add(pair2);
		list.add(pair3);

		System.out.println("\t\tFirst Field\tSecond Field");
		for (Pair p : list) {
			if (p.getSecond().equals("one")) {
				System.out.println("Original pair : " + "\t" + p.getFirst() + "\t" + p.getSecond());
			} else {
				System.out.println("Modified pair : " + "\t" + p.getFirst() + "\t" + p.getSecond());
			}
		}
	}
}
