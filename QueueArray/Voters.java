public class Voters {
	
	String name;
	int age;
	String gender;

	public Voters(String str, int n, String word) {

		this.name = str;
		this.age = n;
		this.gender = word;
	}

	public String toString() {
		return this.name + " " + this.age + " " + this.gender;
	}
}