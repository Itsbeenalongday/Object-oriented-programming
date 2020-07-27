import java.util.ArrayList;

public class GenericTest {
	
	public static void main(String args[]) {
		Juicer j = new Juicer();
		j.method1();
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

class FruitBox<T extends Fruit> extends Box<T> {
}

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Juice{
	String name;
	
	Juice(String name){
		this.name = name +"juice";
	}
	
	public String toString() {
		return name;
	}
}

class Juicer{
	
	FruitBox<Fruit> fruitBox = new FruitBox<>();
	
	static <T extends Fruit>Juice makeJuice(FruitBox<T> box) {
		String tmp = "";
		
		for(Fruit f : box.getList()) {
			tmp += f + " ";
		}
		
		return new Juice(tmp);
	}
	
	void method1() {
		System.out.println(makeJuice(fruitBox));
	}
}