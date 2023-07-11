public class Salutation
{
    public static void main(String[] args)
    {
    int age;
    age = Integer.parseInt(args[0]);
    // afficher une salutation selon l'age
    System.out.print("Salut, votre age est : "+age+" an(s) et vous etes ");
    if (age < 65)
    System.out.println("jeune!");
    else
    System.out.println("vieux!");
    }
}
