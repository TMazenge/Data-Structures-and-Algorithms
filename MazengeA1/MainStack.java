import java.util.*; 

public class MainStack{
	
	public static void main(String[] args){
		MoviesStack movie = new MoviesStack();
	
		Movies panther = new Movies();
		panther.name  = "BlackFirst";
		panther.director = "TimothyMezenge";
		panther.year = 2015;

		Movies black = new Movies();
		black.name  = "whiteSecond";
		black.director ="Kuntazenge";
		black.year = 2015;

		Movies hobbs = new Movies();
		hobbs.name  = "GreenThird";
		hobbs.director = "ZukoMezenge";
		hobbs.year = 2015;

		movie.push(panther);
		movie.push(black);
		movie.push(hobbs);
		movie.getStackItems();
		
		movie.pop();
		movie.pop();
		movie.pop();
		movie.getStackItems();
	}
}

