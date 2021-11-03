package io.turntabl;
import org.junit.Assert;

import org.junit.Test;

public class CorporateClientTest {


    @Test
    public void testClientContactName() {
       CorporateClient c1 = new CorporateClient("Ernestina", "ggg", Level.PREMIUM,"Francis");
       Assert.assertEquals("Francis",c1.clientContactName());
    }
}