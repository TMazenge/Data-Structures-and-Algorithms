public class MainSong{
	
	public static void main(String[] args){
		SongStack songs = new SongStack();

		Song song1 = new Song();
		song1.name = "First";
		song1.artist = "Timmazr";
		song1.length = 2019;

		Song song2 = new Song();
		song2.name = "Second";
		song2.artist = "Taimma";
		song2.length = 2018;

		Song song3 = new Song();
		song3.name = "Third";
		song3.artist = "Tirmos";
		song3.length = 2018;

		songs.push(song1);
		songs.push(song2);
		songs.push(song3);

		songs.getStackContents();
		
		songs.pop();
		songs.pop();
		songs.pop();

		songs.getStackContents();

	}
}