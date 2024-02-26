package net.ukr.mironovakatty.hw18;

public class ClassicMusic extends MusicStyles {
    public static void main(String[] args) {
        PlayMusic classicMusic = new PlayMusic();
        classicMusic.printStyle();
        System.out.println("It's a classic style music");
        classicMusic.band = "Mozart, Beethoven, Mendelsohn";
        System.out.println(classicMusic.band);
    }
}
