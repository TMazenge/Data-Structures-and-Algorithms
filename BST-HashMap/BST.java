public class BST<Key extends Comparable<Key>, Value>{
	
	private Node root;
	private static final boolean RED = true;
	private static final boolean BLACK = false;

	private class Node{
		
		private Key key;
		private Value val;
		private Node left, right;
		boolean color;

		public Node(Key key, Value val, boolean color){
			this.key = key;
			this.val = val;
			this.color = color;
			this.left = null;
			this.right = null;
		}
	}

	// Checks the color of the parent link.
	private boolean isRed(Node x){
		if (x == null) return false;
		return x.color == RED;
	}

	// Rotate Left.
	private Node rotateLeft(Node h){

		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	//Rotate Right.
	private Node rotateRight(Node h){
		
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	// Flip Colors 
	private void flipColors(Node h){
		h.color = RED;
		h.left.color = BLACK;
		h.right.color = BLACK;
	}

	public void put(Key key, Value val){
		root = put(root, key, val);
	}

	// Put method into the BTS
	private Node put(Node h, Key key, Value val){

		if (h == null) return new Node(key, val, RED);
		int cmp = key.compareTo(h.key);
		if (cmp < 0) 
			h.left = put(h.left, key, val);
		else if (cmp > 0)
			h.right = put(h.right, key, val);
		else
			h.val = val;

		if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
		if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
		if (isRed(h.left) && isRed(h.right)) flipColors(h);

		return h;
	}

	// Get method of the BTS
	public Value get(Key key){

		Node x = root;
		while (x != null){
			int cmp = key.compareTo(x.key);
			if      (cmp < 0) x = x.left;
			else if (cmp > 0) x = x.right;
			else            return x.val; 
		}
		return null;
	}

	public void deleteMin(){
		root = deleteMin(root);
	}

	private Node deleteMin(Node x){

		if (x.left == null) return x.right;
		x.left = deleteMin(x.left);
		return x;
	}

	public void delete(Key key){
		root = delete(root, key);
	}

	private Node delete(Node x, Key key){

		if (x == null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0) x.left = delete(x.left, key);
		else if (cmp > 0) x.right = delete(x.right, key);
		else{
			if (x.right == null) return x.left;
			if (x.left == null) return x.right;

			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		return x;
	}

	public Key min() {

		return min(root).key;
	}

	private Node min(Node x){

		if (x.left == null) return x;
        return min(x.left);
	}

	public String toString() {
        return "{" + toString(root) + "}";
    }

    private String toString(Node r) {
        if (r == null)
            return "";
        else
            return r.key.toString() + " " + toString(r.left) + " " + toString(r.right);
    }

}