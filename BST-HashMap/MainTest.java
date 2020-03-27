public class MainTest {
	
	public static void main(String[] args){

		Movie m1 = new Movie("Gemini Man", "Will Smith", 97);
		Movie m2 = new Movie("Aladin", "Robin Williams", 95);
		Movie m3 = new Movie("Finding Dori", "Ellen Degeneres", 98);
		Movie m4 = new Movie("Aquaman", "Denzel Washington", 99);
		Movie m5 = new Movie("Avengers", "Nick Cannon", 92);

		Student s1 = new Student("AaAaAaAa", "AaAaBBAa", 97);
		Student s2 = new Student("AaAaAaBB", "AaBBAaAa", 97);
		Student s3 = new Student("AaAaAaBB", "AaBBAaBB", 97);
		Student s4 = new Student("AaAaAaBB", "AaBBBBAa", 97);
		Student s5 = new Student("BBAaAaAa", "Nick Cannon", 92);

 
		BST bst1 = new  BST();

		bst1.put(m1, 1);
		bst1.put(m2, 2);
		bst1.put(m3, 3);
		

		System.out.println(bst1);
		System.out.println(bst1.get(m2));
		System.out.println(bst1.get(m3));

		LinearProbingHashST lph = new LinearProbingHashST();

		lph.put(s1, 1);
		lph.put(s2, 2);
		lph.put(s3, 3);
		lph.put(s4, 4);
		lph.put(s5, 5);

		System.out.println(lph);
		System.out.println(lph.get(s4));
		System.out.println(lph.get(s5));

		SeperateChainingHashST<Student, Integer> sch = new SeperateChainingHashST<Student, Integer>();

		sch.put(s1, 1);
		sch.put(s2, 2);
		sch.put(s3, 3);
		sch.put(s4, 4);
		sch.put(s5, 5);

		System.out.println(sch);

	}
		
}