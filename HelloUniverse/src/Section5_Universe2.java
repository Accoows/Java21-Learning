/*
Exercice de codage 7 : Utiliser if et else
*/

public class Section5_Universe2 {

    public static void main(String... args){

        String phraseIntro = "En %d, les planètes du système solaire étaient au nombre de : %d";
        short systemeSolaire;
        short annee = 2006;

        if (annee < 2006) {
            systemeSolaire = 9;
        }
        else {
            systemeSolaire = 8;
        }
        System.out.printf(phraseIntro,annee,systemeSolaire);
    }
}