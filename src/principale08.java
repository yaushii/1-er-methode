import java.util.Scanner;


public class principale08 {
	
	static void calculSolde(double prixArticle, double tauxSolde){
	double prixSolde;
	prixSolde = (1 - tauxSolde/100)*prixArticle;
		System.out.println("Le prix de l'article sold� est de "+ prixSolde +"�");
	};

	public static void main(String[] args) {
		double prixArticle = 0., tauxSolde = 0.;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Pour saisir la d�cimal on utilise la virgule.");
		System.out.print("Entrer le prix de l'articles.");
		prixArticle = clavier.nextDouble();
		System.out.println("Saisissez le pourcentage de r�duction.");
		tauxSolde = clavier.nextDouble();
		clavier.close();
		calculSolde(prixArticle, tauxSolde);
		
		
	}

}
