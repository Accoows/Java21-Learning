package Section6;

public class Section6_1 {
    public static void main(String[] args){

        Voiture voitureDeMichel = new Voiture();
        voitureDeMichel.nbporte=3;
        voitureDeMichel.automatique=true;
        voitureDeMichel.couleur="Vert";

        System.out.println("La voiture est " + voitureDeMichel.couleur + " et elle dispose de " + voitureDeMichel.nbporte + " portes.");
        voitureDeMichel.couleur = "Jaune";
        voitureDeMichel.nbporte = 5;

        System.out.println("La voiture est " + voitureDeMichel.couleur + " et elle dispose de " + voitureDeMichel.nbporte + " portes.");

    }
}
