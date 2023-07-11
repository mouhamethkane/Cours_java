 class Compte{
 
	private int solde;   // Solde du compte
    int numero;          // numero du compte
    String titulaire;    //nom du proprietaire

    //un constructeur
    public Compte(int numero, String nom){
    	this.numero = numero;
    	this.titulaire = nom;
    	this.solde = 0;
    	System.out.println("Creation du compte n° "+numero);
    	System.out.println("Compte ouvert par "+nom);
    }

	//definition des Methodes deposer et retirer
	public void deposer(int montant) {
		System.out.println("Depot de "+montant+" sur le compte "+numero);
		solde = solde + montant; 
	}
	
	public void retirer(int montant) {
		System.out.println("Retrait de "+montant+" sur le compte "+numero);
		if(montant <=solde)
			solde = solde - montant;
		else
			System.out.println("Votre solde est insuffisant!");
    } 
    // Definition de la methode virervers
    void virerVers(int montant, Compte destinataire){
        this.retirer(montant);
        destinataire.deposer(montant);
    }
    //Definitin d'une methode d'affichage
    void afficher(){
        System.out.println("Compte n° : "+numero);
        System.out.println("Solde du compte : "+solde);
    }
 }           