import java.util.ArrayList;
import java.util.HashMap;

public class CollectionFrameworkTest {
	public static void main(String[] args) {
		
		HashMap sm = new HashMap();
		
		sm.put(1,"y");
		sm.put(2,"s");
		sm.put(3,"m");
		
		String str = (String)sm.get(1);
		
		System.out.println(str);
		
		ArrayList al = new ArrayList();
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		al.add(arr1);
		al.add(arr2);
		
		int[] i = (int[])al.get(1);
		
		for(int j : i) {
			System.out.println(j);
		}
	}
}
