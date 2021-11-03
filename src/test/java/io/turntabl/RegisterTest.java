package io.turntabl;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RegisterTest  {
@Test
    public void testGoldClients() {
        List<Client> clients = new ArrayList<>();
        clients.add(new PrivateClient("Jenny", "AAA",Level.PLATINUM));
        clients.add(new PrivateClient("Ama", "ddd",Level.GOLD));
        clients.add(new PrivateClient("Akua", "eee",Level.PREMIUM));
        clients.add(new CorporateClient("Ernestina", "fff", Level.GOLD,"Francis"));
        clients.add(new CorporateClient("Ernestina", "ggg", Level.PREMIUM,"Francis"));
        clients.add(new CorporateClient("Ernestina", "hhh", Level.PREMIUM,"Francis"));
        Register r1 = new Register(clients);

        List<String> names = new ArrayList<>();
        names.add("Ama");
        names.add("Francis");
        Assert.assertEquals(names,r1.goldClients());


    }

    @Test
    public void testGetClientNameById() {
        List<Client>clients = new ArrayList<>();
        clients.add(new PrivateClient("Jenny", "AAA",Level.PLATINUM));
        clients.add(new PrivateClient("Ama", "ddd",Level.GOLD));
        clients.add(new PrivateClient("Akua", "eee",Level.PREMIUM));
        clients.add(new CorporateClient("Ernestina", "fff", Level.GOLD,"Francis"));
        clients.add(new CorporateClient("Ernestina", "ggg", Level.PREMIUM,"Francis"));
        clients.add(new CorporateClient("Ernestina", "hhh", Level.PREMIUM,"Francis"));
        Register r1 = new Register(clients);

        Assert.assertNotNull(r1.getClientNameById("ggg").orElse(null));

    }

    public void testClientCount() {
        List<Client>clients = new ArrayList<>();
        clients.add(new PrivateClient("Jenny", "AAA",Level.PLATINUM));
        clients.add(new PrivateClient("Ama", "ddd",Level.GOLD));
        clients.add(new PrivateClient("Akua", "eee",Level.PREMIUM));
        clients.add(new CorporateClient("Ernestina", "fff", Level.GOLD,"Francis"));
        clients.add(new CorporateClient("Ernestina", "ggg", Level.PREMIUM,"Francis"));
        clients.add(new CorporateClient("Ernestina", "hhh", Level.PREMIUM,"Francis"));
        Register r1 = new Register(clients);



    }
}