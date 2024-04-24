package Section5;

public class Section5_2 {

    public static void main(String... args){

        int age = 30;
        System.out.printf("Mon age est %d ans.", age);

        if (age >= 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }

        int autreAge = 25;
        /// Permets de remplacer le fonctionnement d’un IF et Else avec un ' ? ' pour le if, et ' : ' pour le else.
        System.out.println(autreAge > 20 && age < 50 ? "L'age du capitaine est " + autreAge : "Le code ne permet pas d'afficher l'âge du capitaine.");
    }
}