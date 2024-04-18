import br.com.models.Movie;
import br.com.models.Show;
import br.com.models.Title;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MainLists {
	public static void main(String[] args) {

		Movie movie = new Movie("O Senhor dos Anéis", 2002);
		Movie movie2 = new Movie("O Senhor dos Anéis 2", 2003);
		Movie movie3 = new Movie("Interstellar", 2014);
		Show show = new Show("Lost", 2010);
		Show show2 = new Show("Super Natural", 2005);
		List<Title> list = new ArrayList<Title>();
		list.add(movie);
		list.add(movie2);
		list.add(show);
		list.add(show2);
		list.add(movie3);
		Collections.sort(list);
		list.sort(Comparator.comparing(Title::getReleaseYear));
		list.forEach(System.out::println);
	}

}
