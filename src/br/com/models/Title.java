package br.com.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Title implements Comparable<Title> {
	@SerializedName("Title")
	private String name;
	@SerializedName("Year")
	private int releaseYear;

	private boolean includedInThePlan;

	private double sumEvaluation;

	private int totalEvaluations;

	private int duration;

	public Title(String name, int releaseYear) {

		this.name = name;
		this.releaseYear = releaseYear;
	}

	public Title(OndbTitle ondbTitle) {
		this.name = ondbTitle.title();
		this.releaseYear = Integer.valueOf(ondbTitle.year());
		this.duration = Integer.valueOf(ondbTitle.runtime().substring(0, 3));
	}

	public void displayDetails() {

		System.out.println("Nome do filme: " + name);
		System.out.println("Ano de lançamento: " + releaseYear);
		getDurationInMinutes();
	}

	public void evaluate(double grade) {

		sumEvaluation += grade;
		totalEvaluations++;
	}

	public double getAverage() {

		return sumEvaluation / totalEvaluations;
	}

	public int getTotalEvaluations() {

		return totalEvaluations;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setReleaseYear(int releaseYear) {

		this.releaseYear = releaseYear;
	}

	public void setIncludedInThePlan(boolean includedInThePlan) {

		this.includedInThePlan = includedInThePlan;
	}

	public void setDuration(int duration) {

		this.duration = duration;
	}

	public int getDurationInMinutes() {

		return duration;
	}

	public String getName() {

		return name;
	}

	public int getReleaseYear() {

		return releaseYear;
	}

	@Override
	public int compareTo(Title otherTitle) {
		return this.getName().compareTo(otherTitle.getName());
	}

	@Override
	public String toString() {

		return "Nome: " + name + "\n" + "Ano de lançamento: " + releaseYear +
				"\n" + "Duração: " + duration + " minutos";
	}


}
