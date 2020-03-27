public class Student {
	
	String name;
	String classification;
	String major;

	public Student(String name, String clas, String maj) {
		this.name = name;
		this.classification = clas;
		this.major = maj;
	}

	public String toString() {
		return this.name + " " + this.classification + " " + this.major;
	}
}