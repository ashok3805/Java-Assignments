package Assignment_7;


class Student {
	int rollno;
	String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public Student(int rollno) {
		this.rollno = rollno;
		this.name="Unknown";
	}
	public void display() {
		System.out.println("Roll number : "+rollno+" Name : "+name);
	}
	public static void main(String[] args) {
		Student s1 = new Student(100,"Ashok");
		Student s2 = new Student(101);
		s1.display();
		s2.display();
	}
}
