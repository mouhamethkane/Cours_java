public class test{
     public static void main(String[] args){

          Personne p1, p2, p3;
          p1 = new Personne("ndiaye", "waly", "14/04/2022", 785572208);
          p1.infos();
          p2 = new Personne("seck", "idrissa");
          p2.infos();
     }
}

/*
pour executer faire:
javac personne.java     //Compilation de la classe personne
javac test.java        //Compilation de la classe test
java test              //Executionde  la classe test
*/