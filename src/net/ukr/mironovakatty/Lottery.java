package net.ukr.mironovakatty;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int[] organization = generate();
        int[] user = generate();

        System.out.println("Organization ticket: " + Arrays.toString(organization));
        System.out.println("User ticket: " + Arrays.toString(user));

        Arrays.sort(organization);
        Arrays.sort(user);
        System.out.println("Organization sort ticket: " + Arrays.toString(organization));
        System.out.println("User sort ticket: " + Arrays.toString(user));

        System.out.println("Number of coincidences: " + calculateResult(organization, user));
    }

    public static int[] generate() {
        int[] ticket = new int[7];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = ThreadLocalRandom.current().nextInt(10);
        }

        return ticket;
    }

    public static int calculateResult(int[] ticket, int[] userTicket) {
        int result = 0;
        for (int i = 0; i < Math.min(ticket.length, userTicket.length); i++) {
            if (ticket[i] == userTicket[i]) {
                result++;
            }
        }

        return result;
    }

}








