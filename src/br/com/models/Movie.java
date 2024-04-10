package br.com.models;

import br.com.calculations.Sortable;

public class Movie extends Title implements Sortable {
	private String director;

	public void setDirector(String director) {

		this.director = director;
	}

	public void getDirector() {

		System.out.println("Diretor: " + director);
	}

	@Override
	public int getClassification(){
		return (int)getAverage()/2;
	}
}

