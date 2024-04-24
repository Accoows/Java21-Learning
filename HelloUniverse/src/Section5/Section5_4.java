package Section5;

public class Section5_4 {

    public static void main(String... args){
        int mois = 14;

        switch (mois) {
            case 1 :
                System.out.println("C'est Janvier");
                break;
            case 2 :
                System.out.println("C'est Février");
                break;
            case 3 :
                System.out.println("C'est Mars");
                break;
            default :
                System.out.println("Ce mois n'existe pas !");
        }

    }
}