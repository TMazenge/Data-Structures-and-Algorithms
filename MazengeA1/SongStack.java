public class SongStack {
	
	Music first = null;

	class Music {
		Song item;
		Music next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}

	public void push(Song name){
		Music oldSong = first;
		first = new Music();
		first.item = name;
		first.next = oldSong;
	}

	public Song pop() {  
		Song item = first.item;      
		first = first.next;     
		return item; 
	}

	public void getStackContents(){
	 	Music song = first;
	 	while (song != null) {
	 		System.out.println(song.item);
	 		song = song.next;
	 	}
 	}
}