package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListTest 
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[])
	{
		Set<String> names = new HashSet<String>();
		getNames(names); // get input from user
		searchNames(names); // search for names 
	}

	// get names
	public static void getNames(Set<String> names)
	{
		System.out.println("Add a name to set, use end to terminate input : ");
		String inputName = scanner.next();
		
		names.add(inputName);
		// obtain input until end entered
		while (!inputName.equals("end"))
		{
			System.out.println("Add a name to set, use end to terminate input : ");
			inputName = scanner.next(); 
			if(inputName.equals("end")) {
				break;
			}
			names.add(inputName);
		}
		System.out.println(names);
	} 

	// search names from list
	private static void searchNames(Set<String> names)
	{
	  
		// get name from standard input
		System.out.println("Search a name, use end to terminate searching : ");
		String inputName = scanner.next();
		
		// obtain input until end entered
		while (!inputName.equals("end"))
		{
			// write code to search a given name if it exists in a given set on the space provided  
			if(names.contains(inputName)) {
				System.out.printf("%s is exist in a given set", inputName);
				break;
			}
			else {
				System.out.printf("%s is not exist in a given set%n%n", inputName);
			}
			
			// get next search name
			System.out.println("Search a name, use end to terminate searching:");
			inputName = scanner.next();
		}
	} 
}