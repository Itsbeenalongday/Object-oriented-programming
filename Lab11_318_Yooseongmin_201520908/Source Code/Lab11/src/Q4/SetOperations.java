package Q4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
	public static Set<String> union(Set<String> s1, Set<String> s2) {
		Set<String> union = new TreeSet<>(s1);
		union.addAll(s2);
		System.out.println("**All members of two teams**");
		return union;
	}

	public static Set<String> intersection(Set<String> s1, Set<String> s2) {
		Set<String> inter = new TreeSet<String>(s2);
		inter.retainAll(s1);
		System.out.println("**Those who take part in both teams**");
		return inter;
	}

	public static Set<String> difference(Set<String> s1, Set<String> s2) {
		Set<String> differ = new TreeSet<String>(s2);
		differ.addAll(s1);
		Set<String> inter = new TreeSet<String>(s2);
		inter.retainAll(s1);
		differ.removeAll(inter);
		System.out.println("**Those who take part in only one team**");
		return differ;
	}

	public static void main(String args[]) {
		Set<String> footBallTeam = new HashSet<String>();
		footBallTeam.add("Frank");
		footBallTeam.add("Amjad");
		footBallTeam.add("Jim");

		Set<String> basketBallTeam = new HashSet<String>();
		basketBallTeam.add("David");
		basketBallTeam.add("Frank");
		basketBallTeam.add("Scott");

		Set<String> unionSet = union(footBallTeam, basketBallTeam);
		for (String member : unionSet) {
			System.out.println(member);
		}
		Set<String> intersectionSet = intersection(footBallTeam, basketBallTeam);
		for (String member : intersectionSet) {
			System.out.println(member);
		}
		Set<String> differenceSet = difference(footBallTeam, basketBallTeam);
		for (String member : differenceSet) {
			System.out.println(member);
		}
	}

}