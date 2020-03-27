import java.io.*;
import java.util.*; 


public class Friends {
	
	public static void main(String[] args) throws Exception{
		
		Graph G = new Graph(13);

		File file = new File("friends.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));


		String st; 
        while ((st = br.readLine()) != null) {
        	String[] arrOfStr = st.split(",");
        	int one = Integer.parseInt(arrOfStr[0]);
        	int two = Integer.parseInt(arrOfStr[1]);

       		G.addEdge(one, two);

       	}

       	for(int i = 0; i < 13; i++){
       		G.adj[i].getBagItems();
       	}
	}
}
