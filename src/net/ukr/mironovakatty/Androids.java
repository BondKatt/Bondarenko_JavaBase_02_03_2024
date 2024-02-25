package net.ukr.mironovakatty;

public abstract class Androids extends Phones implements Smartphones, OS {
    @Override
    public void call() {
        System.out.println("Android calls!");
    }

    @Override
    public void sms() {
        System.out.println("Android sends sms!");
    }

    @Override
    public void internet() {
        System.out.println("Android has internet connection!");
    }

    @Override
    public void linuxOS() {
        System.out.println("Androids have LinuxOS");
    }

}



