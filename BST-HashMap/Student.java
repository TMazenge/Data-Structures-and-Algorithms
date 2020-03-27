public class Student implements Comparable<Student> {
	
	private final String name;
	private final String classification;
	private final double gpa;

	public Student(String name, String classification, double gpa){

		this.name = name;
		this.classification = classification;
		this.gpa = gpa;
	}

	public String toString(){
		return this.name + this.classification + this.gpa;
	}

	public int hashCode(){
		
		int hash = 7;
		hash = 17*hash + name.hashCode();
		hash = 17*hash + classification.hashCode();
		hash = 17*hash + ((Double) gpa).hashCode();
		return hash;
	}
	public boolean equals(Object o){
		Student s1 = (Student)o;
		if((this.name.equals(s1.name))&&(this.classification.equals(s1.classification))&&(s1.gpa==this.gpa))
			return true;
		else
			return false;
	}

	public int compareTo(Student m) 
    { 
        return this.name.compareTo(m.name);

    } 
	
}