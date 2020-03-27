public class Queue<T> implements Iterable<T> {
	
	private T[] occ;
	private int front, rear, capacity, count;

	public Iterator<T> iterator() { return new QueueIterator(); }

	public class QueueIterator implements Iterator<T> {

		private int i = count;
		public boolean hasNext() {return i > 0;}
		public T next() {return occ[--i];}
	}
	
	public Queue(int max) {
		front = rear = count = 0;
		capacity = max;
		occ = (T[]) new Object[capacity];
	}

	public boolean isEmpty() {
		return occ[front] == null;
	}

    public void enqueue(T item) {

    	if (count == capacity) {
    		rear = capacity;
    		resize(2 * capacity);
    	} 

    	if (rear == capacity && count < capacity) {
    		rear = rear % capacity;    	
     	}
     	occ[rear++] = item;
     	count++;

    }

    public T dequeue() {

    	T item = occ[front];
    	occ[front] = null;
    	front++;
    	front = (front) % capacity;
    	count --;
    	if (count > 0 && count < capacity/4) resize(capacity/2);
  		return item;
    }

    private void resize(int max) {    
		T[] copy = (T[]) new Object[max];
		for (int i = 0; i < rear; i++)       
			copy[i] = occ[i];    
		occ = copy;
		capacity = occ.length; 
	}

	public String toString() {
		String str = "{";
		for(int i = 0; i < rear ; i++){
			str += occ[i] + ", ";
		}
		if (str.length() > 1)
			str = str.substring(0, str.length()-2);
		str += "}";
		return str;
	}	
}