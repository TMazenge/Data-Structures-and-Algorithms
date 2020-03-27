public class Movie implements Comparable<Movie> {
	
	private final String name;
	private final String director;
	private final double rating;

	public Movie(String name, String director, double rating){

		this.name = name;
		this.director = director;
		this.rating = rating;
	}

	public String toString(){
		return this.name + this.director + this.rating;
	}

	public int hashCode(){
		
		int hash = 7;
		hash = 17*hash + name.hashCode();
		hash = 17*hash + director.hashCode();
		hash = 17*hash + ((Double) rating).hashCode();
		return hash;
	}

	public boolean equals(Object o){
		Movie m1 = (Movie)o;
		if((this.name.equals(m1.name))&&(this.director.equals(m1.director))&&(m1.rating==this.rating))
			return true;
		else
			return false;
	}

	public int compareTo(Movie m) 
    { 
        return this.name.compareTo(m.name);

    } 
	
}