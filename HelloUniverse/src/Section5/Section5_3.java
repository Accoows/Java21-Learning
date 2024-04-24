package Section5;

public class Section5_3 {

    public static void main(String... args){

        int age = 45;
        System.out.printf("Mon age est %d ans.", age);

        if (age >= 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }
        else {
            if (age < 10) {
                System.out.println(" Bravo à toi de commencer si jeune.");
            }

        }
    }
}