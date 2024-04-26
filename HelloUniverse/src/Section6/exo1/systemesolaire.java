package Section6.exo1;

/*
Exercice 14: Galilée ou la réalité des planètes (Version 3) - Les attributs / Propriétés
*/

public class systemesolaire {
    public static void  main(String... args){
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880L;
        mercure.matiere = "tellurique";

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100L;
        venus.matiere = "tellurique";

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756L;
        terre.matiere = "tellurique";

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792L;
        mars.matiere = "tellurique";

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984L;
        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536L;
        saturne.matiere = "gazeuse";

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118L;
        uranus.matiere = "gazeuse";

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        uranus.diametre = 49532L;
        neptune.matiere = "gazeuse";
    }
}
