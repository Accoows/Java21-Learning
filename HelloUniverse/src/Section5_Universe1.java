/*
Exercice de codage 6 : Affichage conditionnel - Première instruction conditionnelle
*/

public class Section5_Universe1 {

    public static void main(String... args){

        short systemeSolaire;
        short annee = 2014;

        if (annee < 2014) {
            systemeSolaire = 9;
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d", annee, systemeSolaire);
        }
        if (annee >= 2014) {
            systemeSolaire = 8;
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d", annee, systemeSolaire);
        }
    }
}