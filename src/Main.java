import br.com.calculations.*;
import br.com.models.*;

public class Main {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setName("Star Wars");
		Show lost = new Show();
		lost.setName("Lost");
		lost.setSeasons(4);
		lost.setEpisodesBySeason(10);
		lost.getSeasons();
		lost.getEpisodesBySeason();
		lost.getName();
		Episode episode = new Episode();
		episode.setNumber(1);
		episode.setShow(lost);
		episode.setTotalViews(45);
		RecommendationFilter filter = new RecommendationFilter();
		filter.filter(episode);
	}
}

