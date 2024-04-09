package br.com.models;

public class Movie extends Title {
	private String director;

	public void setDirector(String director) {
		this.director = director;
	}

	public void getDirector() {
		System.out.println("Diretor: " + director);
	}
}
