public class MainVoters {
	
	public static void main(String[] args){

		VotersQueue q = new VotersQueue(2);

		Voters one = new Voters("Timothy", 10, "Engineering");
		Voters two = new Voters("Noah", 11, "Civil");
		Voters three = new Voters("Michael", 12, "Sciences");
		
		q.enqueue(one);
		q.enqueue(two);
		q.enqueue(three);
		
		System.out.println(q);

		while(!q.isEmpty()){
		 	System.out.println(q.dequeue());
		 }
		
		System.out.println(q);
	}

}
