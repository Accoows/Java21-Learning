package Section4;

public class Section4_1 {
    public static void  main(String... args){
        float resultat = 5f/(2+3);
        boolean Comparaison = 10 < 10;
        System.out.println(resultat);
        System.out.println(Comparaison);
        System.out.println();

        boolean bool1_1 = true;
        boolean bool2_1 = true;
        boolean test1 = bool1_1 & bool2_1;
        boolean test1_1 = bool1_1 && bool2_1;
        System.out.println(test1);
        System.out.println(test1_1);

        /*
        AND (&):                                OR (|):
        bool1   bool2   bool1&bool2             bool1   bool2   bool1 | bool2
        true    true    true                    true    true    true
        true    false   false                   true    false   true
        false   true    false                   false   true    true
        false   false   false                   false   false   false*

        XOR (^):                                NOT (!):
        bool1   bool2   bool1^bool2             bool1   bool2   !bool1 | bool2
        true    true    false                   true    true    true
        true    false   true                    true    false   false (true)
        false   true    true                    false   true    true
        false   false   false                   false   false   true (false)
        * */


    }
}
