package net.ukr.mironovakatty.hw18;

public class RockMusic extends MusicStyles {
    public static void main(String[] args) {
        PlayMusic rockMusic = new PlayMusic();
        rockMusic.printStyle();
        System.out.println("It's a rock style music");
        rockMusic.band = "Queen, Scorpions, Rammstein";
        System.out.println(rockMusic.band);
    }
}