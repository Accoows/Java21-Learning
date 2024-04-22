/*
Exercice de codage 6 : Affichage conditionnel - Première instruction conditionnelle
*/

public class Section5_Universe1 {

    public static void main(String... args){

        String phraseIntro = "En %d, les planètes du système solaire étaient au nombre de : %d"
        short systemeSolaire = 0;
        short annee = 2014;

        if (annee < 2014) {
            systemeSolaire = 9;
        }
        if (annee >= 2014) {
            systemeSolaire = 8;
        }
        System.out.printf(phraseIntro,annee,systemeSolaire);
    }
}