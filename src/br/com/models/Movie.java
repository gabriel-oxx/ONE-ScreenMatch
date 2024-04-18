package br.com.models;

import br.com.calculations.Sortable;

public class Movie extends Title implements Sortable {
	private String director;

	public Movie(String name, int releaseYear) {

		super(name, releaseYear);
	}

	public void setDirector(String director) {

		this.director = director;
	}

	public void getDirector() {

		System.out.println("Diretor: " + director);
	}

	@Override
	public int getClassification() {

		return (int) getAverage() / 2;
	}

	@Override
	public String toString() {

		return "Filme: " + this.getName() + ", " + this.getReleaseYear();
	}

}
