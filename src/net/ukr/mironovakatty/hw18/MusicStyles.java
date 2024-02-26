package net.ukr.mironovakatty.hw18;

public class MusicStyles {


    public static void main(String[] args) {
        PlayMusic playMusic = new PlayMusic();
        playMusic.printStyle();
    }
}

class PlayMusic {
    public String band;

    public void printStyle() {
        System.out.println("Style created");
    }
}
