package net.ukr.mironovakatty;

public class Parallelepiped {
    public static void main(String[] args) {
        int lenght = 11;
        int width = 20;
        int heigth = 7;
        int volume = lenght * width * heigth;
        System.out.println("Volume = " + volume);

        int perimeter = 4 * (lenght + width + heigth);
        System.out.println("Perimeter = " + perimeter);
    }
}
