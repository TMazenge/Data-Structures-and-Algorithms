public class MoviesStack{
	
	Node head = null;

	class Node {
		Movies item;
		Node next;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void push(Movies item){
		Node oldHead = head;
		head = new Node();
		head.item = item;
		head.next = oldHead;	
	}

	public Movies pop() {  
		Movies item = head.item;      
		head = head.next;     
		return item; 
	}

	public void getStackItems(){
	 	Node first = head;
	 	while (first != null) {
	 		System.out.println(first.item);
	 		first = first.next;
	 	}
 	}
}

