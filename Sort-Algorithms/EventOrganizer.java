import java.io.*;
import java.util.*; 


public class EventOrganizer{
	
	public static void main(String[] args) throws Exception{
		File file = new File("guests.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		Guest[] list = new Guest[7];

		int count = 0;

		String st; 
        while ((st = br.readLine()) != null) {
        	String[] arrOfStr = st.split(",");

       		String name = arrOfStr[0];
       		String lastName = arrOfStr[1];
       		int age = Integer.parseInt(arrOfStr[2]);
       		String phoneNumber = arrOfStr[3];

       		list[count] = new Guest(name, lastName, age, phoneNumber);
       		count++;
       	}

       	MergeSort.sort(list);

       	for (int i = 0; i < list.length; i++){
       		System.out.println(list[i]);
       	}

	}

}

