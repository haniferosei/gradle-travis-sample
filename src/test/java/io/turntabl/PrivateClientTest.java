package io.turntabl;


import org.junit.Assert;

import org.junit.Test;

public class PrivateClientTest {
@Test
    public void testClientContactName() {
       PrivateClient p1= new PrivateClient("Akua", "eee",Level.PREMIUM);
       Assert.assertEquals("Akua",p1.clientContactName());
    }
}