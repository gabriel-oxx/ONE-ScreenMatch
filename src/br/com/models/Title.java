package br.com.models;

public class Title {
	private String name;
	private int releaseYear;
	private boolean includedInThePlan;
	private double sumEvaluation;
	private int totalEvaluations;
	private int duration;

	public void displayDetails() {
		System.out.println("Nome do filme: " + name);
		System.out.println("Ano de lançamento: " + releaseYear);
		getDuration();
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

	private void getDuration() {
		int hours = duration / 60;
		int minutes = duration % 60;
		System.out.println("Duração: " + hours + " horas e " + minutes + " minutos");
	}

}
