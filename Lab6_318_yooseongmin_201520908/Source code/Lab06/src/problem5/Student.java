package problem5;

class Student {
	String name;
	int ID;
	
	public Student(String name,int ID) {
		this.name = name;
		this.ID  = ID;
	}
	
	
	public boolean equals(Object obj) {
		try {
			String name1 = this.name;
			int ID1 = this.ID;
			
			Student s = (Student)obj;
			String name2 = s.name;
			int ID2 = s.ID;
			
			if(name1.equals(name2) && (ID1==ID2))
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
