import java.util.Iterator;

public class Bag<String> implements Iterable<String> {
	
	private Node first;

	private class Node{

		String item;
		Node next;
	}

	public void add(String item){

		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public Iterator<String> iterator() {
		return new ListIterator();
	}
	
	public class ListIterator implements Iterator<String>{

		private Node current = first;

		public boolean hasNext(){
			return current != null;
		}

		public String next() {
			String item = current.item;
			current = current.next;
			return item;
		}
	}

	public void getBagItems(){
		Node start = first;
		while (start != null){
			System.out.println(start.item);
		  	start = start.next;
		}
		
	}
}