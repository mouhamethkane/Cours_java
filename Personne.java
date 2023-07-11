class Personne{  
//les attributs
String datenaiss;
String nom, prenom;
int tel; 

//constructeurs
public Personne (String nom, String p, String datenaiss, int num_tel){
 this.nom = nom; //this est un autoreferenceur qui designe la classe meme 
 prenom = p; this.datenaiss = datenaiss;
 tel = num_tel;
}
public Personne(String nom, String prenom){
    this.nom = nom; this.prenom = prenom;
}

//autres methodes
public void infos(){
    System.out.println("je m'apppelle : "+prenom+" "+nom);
    System.out.println("mon numero est :"+tel );
}


}