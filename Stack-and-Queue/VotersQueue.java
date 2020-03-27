public class VotersQueue {
	
	private Voters[] occ;
	private int front, rear, capacity, count;

	public VotersQueue(int max) {
		front = rear = count = 0;
		capacity = max;
		occ = new Voters[capacity];
	}

	public boolean isEmpty() {
		return occ[front] == null;
	}

    public void enqueue(Voters voter) {

    	if (count == capacity) {
    		rear = capacity;
    		resize(2 * capacity);
    	} 

    	if (rear == capacity && count < capacity) {
    		rear = rear % capacity;    
     		occ[rear++] = voter; 	
     	}
     	occ[rear++] = voter;
     	count++;

    }

    public Voters dequeue() {

    	Voters item = occ[front];
    	occ[front] = null;
    	front++;
    	front = (front) % capacity;
    	count --;
    	if (count > 0 && count < capacity/4) resize(capacity/2);
  		return item;
    }

    private void resize(int max) {    
		Voters[] copy = new Voters[max];    
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