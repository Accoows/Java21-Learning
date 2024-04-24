/*
Exercice de codage 8 : Utiliser if, else et else if
*/

public class Section5_Universe3 {

    public static void main(String... args){

        String phraseIntro = "En %d, les planètes du système solaire étaient au nombre de : %d";
        int systemeSolaire;
        short annee = 2005;

        if (annee < 1600 || annee > 2020) {
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d", annee);
        }
        else {
            if (annee < 1700) {
                systemeSolaire = 7;
            }
            else if (annee < 1800) {
                systemeSolaire = 8;
            }
            else if (annee < 2006) {
                systemeSolaire = 9;
            } else {
                systemeSolaire = 8;
            }
            System.out.printf(phraseIntro,annee,systemeSolaire);
        }
    }
}