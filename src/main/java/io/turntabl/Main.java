package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client>clients = new ArrayList<>();
        clients.add(new PrivateClient("Jenny", "AAA",Level.PLATINUM));
        clients.add(new PrivateClient("Ama", "ddd",Level.GOLD));
        clients.add(new PrivateClient("Akua", "eee",Level.PREMIUM));
        clients.add(new CorporateClient("Ernestina", "fff", Level.GOLD,"Francis"));
        clients.add(new CorporateClient("Ernestina", "ggg", Level.PREMIUM,"Francis"));
        clients.add(new CorporateClient("Ernestina", "hhh", Level.PREMIUM,"Francis"));
         Register r1 = new Register(clients);
        System.out.println(r1.getClientNameById("AAA").orElse(null));

        System.out.println(r1.clientCount());

        System.out.println(r1.goldClients());


    }
}
