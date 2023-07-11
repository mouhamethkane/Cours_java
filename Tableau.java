 public class Tableau {
  // nombre = new int[10]{
	public static void main(String[] args){
	  Compte compte0, compte1, compte2, compte3, compte4, compte5, compte6, compte7, compte8, compte9;  //création de deux references pour objets compte
      
      //Instanciation des objets compte
      compte0 = new Compte(0, "Mamadou DIOP");
      compte1 = new Compte(1, "Fatou Sall");
      compte2 = new Compte(2, "Ameth Diouf");
      compte3 = new Compte(3, "Modou Sene");
      compte4 = new Compte(4, "Coumba Sow");
      compte5 = new Compte(5, "Assane Diouf");
      compte6 = new Compte(6, "Moussa Fall");
      compte7 = new Compte(7, "Amy Ndiaye");
      compte8 = new Compte(8, "Saliou Niang");
      compte9 = new Compte(9, "Sidi Kane");
      
      // Manipulation des objets crées
      compte0.deposer(130000 + (50000 * 0));
      compte1.deposer(120000 + (50000 * 1));
      compte2.deposer(120000 + (50000 * 2));
      compte3.deposer(120000 + (50000 * 3));
      compte4.deposer(120000 + (50000 * 4));
      compte5.deposer(120000 + (50000 * 5));
      compte6.deposer(120000 + (50000 * 6));
      compte7.deposer(120000 + (50000 * 7));
      compte8.deposer(120000 + (50000 * 8));
      compte9.deposer(120000 + (50000 * 9));
      //Virer des comptes
      compte0.virerVers(10000, compte1,compte2,compte3,compte4,compte5,compte6,compte7,compte8,compte9);
      compte1.virerVers(10000, compte2,compte3,compte4,compte5,compte6,compte7,compte8,compte9);
      compte2.virerVers(10000, compte3,compte4,compte5,compte6,compte7,compte8,compte9);
      compte3.virerVers(10000, compte4,compte5,compte6,compte7,compte8,compte9);
      compte4.virerVers(10000, compte5,compte6,compte7,compte8,compte9);
      compte5.virerVers(10000, compte6,compte7,compte8,compte9);
      compte6.virerVers(10000, compte7,compte8,compte9);
      compte7.virerVers(10000, compte8,compte9);
      compte8.virerVers(10000, compte9);
     
      compte0.afficher(); 
      compte1.afficher();
      compte2.afficher();
      compte3.afficher();
      compte4.afficher();
      compte5.afficher();
      compte6.afficher();
      compte7.afficher();
      compte8.afficher();
      compte9.afficher();
	}
  
}