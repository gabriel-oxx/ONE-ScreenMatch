package br.com.calculations;

import br.com.models.Title;

public class TimeCalculator {
	private int totalTime;

	public int getTotalTime() {
		return totalTime;
	}

	public void includes(Title t) {
		this.totalTime += t.getDurationInMinutes();
	}
}
