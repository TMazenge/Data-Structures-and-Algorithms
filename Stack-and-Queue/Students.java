public class Students {
	
	public static void main(String[] args){

		StudentStack s = new StudentStack(5);

		Student one = new Student("Timothy", "Sompomore", "Engineering");
		Student two = new Student("Noah", "Junior", "Civil");
		Student three = new Student("Michael", "School", "Sciences");

		s.push(one);
		s.push(two);
		s.push(three);

		System.out.println(s);

		while(! s.isEmpty()){
			System.out.println(s.pop());
		}
		System.out.println(s);

	}

}