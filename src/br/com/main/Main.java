import br.com.calculations.*;
import br.com.models.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Movie movie = new Movie("O Senhor dos Anéis", 2002);
		Movie movie2 = new Movie("O Senhor dos Anéis 2", 2003);
Show show = new Show("Lost", 2010);
		ArrayList<Movie> movieArrayList = new ArrayList<Movie>();
		movieArrayList.add(movie);
		movieArrayList.add(movie2);
		System.out.println(movieArrayList.toString());
	}

}
