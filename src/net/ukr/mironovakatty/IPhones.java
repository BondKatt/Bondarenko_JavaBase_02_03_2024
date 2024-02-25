package net.ukr.mironovakatty;

public abstract class IPhones extends Phones implements Smartphones, OS {
    @Override
    public void call() {

        System.out.println("iPhones calls");
    }

    @Override
    public void sms() {

        System.out.println("iPhones sends sms");
    }

    @Override
    public void internet() {

        System.out.println("iPhones has internet connection");
    }

    @Override
    public void iOS() {
        System.out.println("iPhones have iOS");
    }
}
