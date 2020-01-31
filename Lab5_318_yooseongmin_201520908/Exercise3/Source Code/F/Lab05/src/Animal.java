public abstract class Animal {
	public abstract void cry();
}

class Dog extends Animal {
	public void cry() {
		System.out.println("sound of dog : waw_waw_waw");
	}
}
class Cat extends Animal {
	public void cry() {
		System.out.println("sound of cat : miyaw_miyaw_miyaw");
	}
}
class Sheep extends Animal {
	public void cry() {
		System.out.println("sound of sheep : ba_ba_ba");
	}
}
