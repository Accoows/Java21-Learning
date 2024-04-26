package Section4;/*
Exercice de codage 4 : Le cas de pluton Version 2
 */

public class HelloUniverse3 {
    public static void main(String... args){
        int systemeSolaire = 8;
        String planetestring = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(planetestring + systemeSolaire);
        ++systemeSolaire;
        planetestring = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(planetestring + systemeSolaire);
    }
}
