import java.util.Random;

public class RandomUnion {
	
	public static void main(String[] args){

		Random rand = new Random();
		
		int count = 0;
		QuickUF uf = new QuickUF(1000);
		int unionCount = 0;
		while (unionCount != 999) {

			int p = rand.nextInt(1000);
		    int q = rand.nextInt(1000);
		   
		    if (!uf.connected(p, q)) { 
		    	uf.union(p, q);
		    	unionCount++;
		    }
		    count++;
		    System.out.println("Union count: " + unionCount + " Random count: " + count);
		}
		System.out.println("Union count / count: " + 100.0 * unionCount/count);
		System.out.println(uf);
	}

}