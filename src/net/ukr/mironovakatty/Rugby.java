package net.ukr.mironovakatty;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {

        int[] teamDream = new int[25];
        System.out.print("Team Dream age: ");
        for (int i = 0; i < teamDream.length; i++) {
            teamDream[i] = ThreadLocalRandom.current().nextInt(18, 41);
            System.out.print(" " + teamDream[i]);
        }
        int[] teamArmageddon = new int[25];
        System.out.println();
        System.out.print("Team Armageddon age: ");
        for (int j = 0; j < teamArmageddon.length; j++) {
            teamArmageddon[j] = ThreadLocalRandom.current().nextInt(18, 41);
            System.out.print(" " + teamArmageddon[j]);
        }
        int resultDream = 0;
        for (int k : teamDream) {
            resultDream += k;
        }
        System.out.println();
        System.out.println("Avarage age for teamDream is: " + resultDream / teamDream.length);
        //}
        int resultArmageddon = 0;
        for (int l : teamArmageddon) {
            resultArmageddon += l;
        }
        //System.out.println();
        System.out.println("Avarage age for teamArmageddon is: " + resultArmageddon / teamArmageddon.length);
    }
}
