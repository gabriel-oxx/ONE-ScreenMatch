package br.com.models;

import br.com.calculations.Sortable;
import br.com.models.Show;

public class Episode implements Sortable {
	private int number;
	private String name;
	private Show show;
	private int totalViews;

	public int getTotalViews() {

		return totalViews;
	}

	public void setTotalViews(int totalViews) {

		this.totalViews = totalViews;
	}

	public Show getShow() {

		return show;
	}

	public void setShow(Show show) {

		this.show = show;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getNumber() {

		return number;
	}

	public void setNumber(int number) {

		this.number = number;
	}

	@Override
	public int getClassification() {

		if (totalViews > 100)
			return 4;
		else if (totalViews >= 50)
			return 3;
		else
			return 2;
	}

}



