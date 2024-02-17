package net.ukr.mironovakatty;

public class Burgers {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;

    public static void main(String[] args) {
        Burgers ordinaryBurgers = new Burgers();
        ordinaryBurgers.bun = "1 portion";
        ordinaryBurgers.meat = "1 portion";
        ordinaryBurgers.cheese = "1 portion";
        ordinaryBurgers.greenery = "1 portion";
        ordinaryBurgers.mayonnaise = "1 portion";
        System.out.println("Ordinary burger: " + "\n Buns- " + ordinaryBurgers.bun + "\n Meat- " + ordinaryBurgers.meat
                + "\n Cheease- " + ordinaryBurgers.cheese + "\n Greenary- " + ordinaryBurgers.greenery + "\n Mayonnaise- " +
                ordinaryBurgers.mayonnaise);

        Burgers dietBurgers = new Burgers();
        dietBurgers.bun = "1 portion";
        dietBurgers.meat = "1 portion";
        dietBurgers.cheese = "1 portion";
        dietBurgers.greenery = "1 portion";
        System.out.println("\n Diet burger: " + "\n Buns- " + dietBurgers.bun + "\n Meat- " + dietBurgers.meat
                + "\n Cheease- " + dietBurgers.cheese + "\n Greenary- " + dietBurgers.greenery + "\n Mayonnaise- " +
                dietBurgers.mayonnaise);

        Burgers doubleMeatburgers = new Burgers();
        doubleMeatburgers.bun = "1 portion";
        doubleMeatburgers.meat = "2 portions";
        doubleMeatburgers.cheese = "1 portion";
        doubleMeatburgers.greenery = "1 portion";
        doubleMeatburgers.mayonnaise = "1 portion";

        System.out.println("\n Double meat burger: " + "\n Buns- " + doubleMeatburgers.bun + "\n Meat- " + doubleMeatburgers.meat
                + "\n Cheease- " + doubleMeatburgers.cheese + "\n Greenary- " + doubleMeatburgers.greenery + "\n Mayonnaise- " +
                doubleMeatburgers.mayonnaise);
    }
}
