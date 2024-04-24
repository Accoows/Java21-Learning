package Section5;

public class Section5_1 {

    public static void main(String... args){

        int age = 30;
        System.out.printf("Mon age est %d ans.", age);

        if (age >= 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }

        int autreAge = 25;
        if (autreAge > 20 && age < 50)
        {
            System.out.println("L'age du capitaine est " + autreAge);
        }
        else {
            System.out.println("Le code ne permet pas d'afficher l'âge du capitaine.");
        }
    }
}
