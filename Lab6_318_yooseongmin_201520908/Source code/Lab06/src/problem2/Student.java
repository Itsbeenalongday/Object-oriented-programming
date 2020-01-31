package problem2;

class Student {
	String name;
	int ID;

	public Student(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	
	public String toString() { 
		return "Student name:" + name + "and ID:" + ID; 
	}
	

	public static void main(String args[]) {
		Student s1 = new Student("kim", 101);
		Student s2 = new Student("Homin", 102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}
