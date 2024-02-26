package net.ukr.mironovakatty.hw18;

public class PopMusic extends MusicStyles {
    public static void main(String[] args) {
        PlayMusic popMusic = new PlayMusic();
        popMusic.printStyle();
        System.out.println("It's a pop style music");
        popMusic.band = "Abba, Spice Girls, Boney M";
        System.out.println(popMusic.band);
    }
}
