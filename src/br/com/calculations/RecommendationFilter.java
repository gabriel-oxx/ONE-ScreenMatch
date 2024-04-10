package br.com.calculations;

public class RecommendationFilter {

	public void filter(Sortable sortable) {

		if (sortable.getClassification() >= 4) {
			System.out.println("Está entre os preferidos do momento");
		} else if (sortable.getClassification() >= 3) {
			System.out.println("Muito bem avaliado no momento");
		}else{
			System.out.println("Coloque na sua lista para assistir depois");
		}
	}

}

