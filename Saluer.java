public class Saluer
{
    public static void main(String[] args)
    {
     int age = Integer.parseInt(args[0]);
     String prenon = args[1];
     String nom = args[2];
    // afficher une salutation selon l'age
    System.out.print("Salut, "+prenon+" "+nom+", votre age est : "+age+" an(s) et vous etes ");
    if (age < 65)
    System.out.println("jeune!");
    else
    System.out.println("vieux!");
    }
}