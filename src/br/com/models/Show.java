package br.com.models;

public class Show extends Title {
	private int seasons;
	private int episodesBySeason;
	private boolean isActive;
	private int minutesByEpisode;

	public Show(String name, int releaseYear) {

		super(name, releaseYear);
	}

	public void setSeasons(int seasons) {

		this.seasons = seasons;
	}

	public void setEpisodesBySeason(int episodesBySeason) {

		this.episodesBySeason = episodesBySeason;
	}

	public void setIsActive(boolean isActive) {

		this.isActive = isActive;
	}

	public void setMinutesByEpisode(int minutesByEpisode) {

		this.minutesByEpisode = minutesByEpisode;
	}

	public int getSeasons() {

		return seasons;
	}

	public int getEpisodesBySeason() {

		return episodesBySeason;
	}

	public boolean getIsActive() {

		return isActive;
	}

	public int getMinutesByEpisode() {

		return minutesByEpisode;
	}

	@Override
	public int getDurationInMinutes() {

		return getSeasons() * getEpisodesBySeason() * getMinutesByEpisode();
	}

	@Override
	public void displayDetails() {

		System.out.println("Nome da serie: " + getName());
		System.out.println("Ano de lançamento: " + getReleaseYear());
		System.out.println("Temporadas: " + getSeasons());
		System.out.println("Episódios por temporada: " + getEpisodesBySeason());
	}

	@Override
	public String toString() {

		return "Série: " + this.getName() + ", " + this.getReleaseYear();
	}
}
