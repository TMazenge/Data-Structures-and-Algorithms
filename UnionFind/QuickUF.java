public class QuickUF {
	
	private int[] id;
	private int[] sz;

	public QuickUF(int num){
		sz = new int[num];
		id = new int[num];
		for (int i = 0; i < num; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	private int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

	public boolean connected(int p, int q){

		return root(p) == root(q);
	}

	public void union(int p, int q){

		int i = root(p);
		int j = root(q);

		int newRoot;
		int notRoot;
		if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i];newRoot = j; notRoot = i; }
		else               { id[j] = i; sz[i] += sz[j];newRoot = i; notRoot = j; }

		for(int k=0; k<id.length; k++){
			if (id[k] == notRoot){
				id[k] = newRoot;
			}
		}
	}

	public String toString(){
		String str = "";
		for(int i=0; i<id.length; i++){
			str += id[i] + " ";
		}
		return str;
	}
}