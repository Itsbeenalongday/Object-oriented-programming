package problem6;

class Student {
	String name;
	int ID;
	
	public Student(String name,int ID) {
		this.name = name;
		this.ID  = ID;
	}
	
	
	public boolean equals(Object obj) {
		try {
			Student s =(Student)obj;
			
			if(name.equals(s.name) && (ID==s.ID))
				return true;
			else
				return false;
		}
		
		catch(ClassCastException e){
			return false;
		}
		
		catch(NullPointerException e) {
			return false;
		}
	}
	
	
	public static void main(String args[]) {
		Student s1 = new Student("kim", 101);
		Student s2 = new Student("Homin", 102);
		Student s3 = new Student("Homin", 102);
		Student s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("kim"));
		System.out.println(s1.equals(null));
	}
}