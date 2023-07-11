 public class TestCompte {
	public static void main(String[] args){
	  Compte compte1, compte2;  //création de deux references pour objets compte
      
      //Instanciation des objets compte
      compte1 = new Compte(1001, "Mamadou DIOP");
      compte2 = new Compte(1002, "Fatou Sall");
      
      // Manipulation des objets crées
      compte1.deposer(1500000);
      compte2.deposer(120000);
      compte1.virerVers(450000, compte2);
     
      compte1.afficher(); 
      compte2.afficher();
	}
}

//Classe scanner permet de lire au clavier. Jetez un coup d'oeil
// [15:06, 04/05/2023] Maoloud Fall: public void nombreAnnees (double solde, double montantVoulu, double tauxInteret ) {
// 	int nbr_annees = 0;
// 	while (solde < montantVoulu) {
// 		nbr_annees++;
// 		double interets = solde * tauxInteret;
// 		solde += interets;
// 	}
// 	System.out.println(nbr_annees + " ans sont nécessaires");
// }

// Question: Proposez une classe contenant cette methode et qui peut être appelée en ligne de commandes avec les parametres (solde, montantvoulu, taux).