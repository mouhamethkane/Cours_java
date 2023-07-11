class Personnel{
    //les attributs
    private String prenom, nom;
    private int numerosecu;
    String telephone;

    public Personne(String prenom, String nom, int ns, String tel ){
        this.prenom = prenom;
        this.nom = nom;
        this.numerosecu = ns;
        this.telephone = tel;
    }
    //Accesseurs
    public String getPersonne(){
        return this.prenom;
    }
    public String getNom(){
        return this.nom;
    }
    public String getNumerosecu(){
        return this.numerosecu;
    }
    public String getTelephone(){
        return this.telephone;
    }
    //Modificateur ou setteurs
    public setTelephone(String new_number){
        this.telephone = new_number;
        System.out.println("Le numro de telephone a ete mise a jour ");
    }
    public void afficherPersonne(){
        System.out.println("------------------------------");
        System.out.println("Prenom : "+prenom);
        System.out.println("Nom : "+nom);
        System.out.println("NSS : "+numerosecu);
        System.out.println("Telephone : "+telephone);
        System.out.println("------------------------------");
    }
}



