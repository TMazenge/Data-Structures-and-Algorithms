public class StudentStack {
	
	private Student[] s;
	private int N = 0;

	public StudentStack(int max) {
		s = new Student[max];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public void push(Student item) {
		if (N == s.length) resize(2 * s.length);
		s[N++] = item;
	}

	public Student pop() {
		Student item = s[--N];
		if (N > 0 && N == s.length/4) resize(s.length/2);
		s[N] = null;
		return item;
	}

	private void resize(int max) {    
		Student[] copy = new Student[max];    
		for (int i = 0; i < N; i++)       
			copy[i] = s[i];    
		s = copy; 
	}

	public String toString() {
		String str = "{";
		for(int i=0; i<N; i++){
			str += s[i] + ", ";
		}
		if (str.length() > 1)
			str = str.substring(0, str.length()-2);
		str += "}";
		return str;
	}	
}