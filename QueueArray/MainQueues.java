public class MainQueues {
	
	public static void main(String[] args){

		Queue<Voters> voters = new Queue<Voters>(3);
		Queue<Student> students = new Queue<Student>(3);

		Voters one = new Voters("Timothy", 10, "Engineering");
		Voters two = new Voters("Noah", 11, "Civil");
		Voters three = new Voters("Michael", 12, "Sciences");

		Student st1 = new Student("Timothy", "sophomore", "Engineering");
		Student st2 = new Student("Noah", "junior", "Civil");
		Student st3 = new Student("Michael", "senior", "Sciences");

		
		voters.enqueue(one);
		voters.enqueue(two);
		voters.enqueue(three);

		students.enqueue(st1);
		students.enqueue(st2);
		students.enqueue(st3);

		System.out.println(voters);
		System.out.println(students);
		
		Iterator<Voters> i = voters.iterator();
		while (i.hasNext()) {
			Voters s = i.next();
			System.out.println(s);
		}	

		Iterator<Student> p = students.iterator();
		while (p.hasNext()) {
			Student s = p.next();
			System.out.println(s);
		}

		voters.dequeue();
		students.dequeue();

		System.out.println(voters);
		System.out.println(students);
	}

}
