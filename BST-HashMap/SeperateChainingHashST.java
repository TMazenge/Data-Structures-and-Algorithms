import java.util.Arrays;

public class SeperateChainingHashST<Key, Value>{
	
	private int M = 97;
	public Node[] st = new Node[M];

	private static class Node {
		private Object key;
		private Object val;
		private Node next;

		public Node(Object key, Object val, Node next){
			this.key = key;
			this.val = val;
			this.next = next;
		}
		public String toString(){
			String str = "{";
			for(Node x=this; x != null; x= x.next){
				str += x.key.toString() + " ";
			}
			str += "}";
			return str;
		}
	}

	private int hash(Key key){
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public Value get(Key key) {
		int i = hash(key);
		for (Node x = st[i]; x != null; x = x.next)
			if (key.equals(x.key)) return (Value) x.val;
		return null;
	}

	public void put(Key key, Value val){
		int i = hash(key);
		System.out.println("Hashed to: "  + i);
		for(Node x = st[i]; x != null; x = x.next)
			if (key.equals(x.key)) {x.val = val; return;}
		st[i]  = new Node(key, val, st[i]);
	}

	public String toString(){
		return Arrays.toString(st);
	}
}