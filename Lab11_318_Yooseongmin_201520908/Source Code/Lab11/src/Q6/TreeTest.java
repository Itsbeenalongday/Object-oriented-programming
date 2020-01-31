package Q6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.StringTokenizer;

public class TreeTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); // create scanner

		System.out.println("Please enter a line of text:");
		String input = scanner.nextLine(); // get input text

		TreeSet<String> tree = new TreeSet<String>();
		StringTokenizer tz = new StringTokenizer(input);
		// exactly i can't understand why the StringToeknizer object is written.
		// because at word file you gave, there says that "uses a String method split to
		// tokenize a line"
		// so i didn't use StringTokenizer but used split method.
		String[] words = input.split(" ");
		for (String wd : words) {
			System.out.println(wd);
			tree.add(wd);
		}
		System.out.println(" ^ Text is tokenized!");
		String arr[] = new String[tree.size()];
		tree.toArray(arr);
		Arrays.sort(arr);
		System.out.println("Elements in tree : " + tree);
	}
}