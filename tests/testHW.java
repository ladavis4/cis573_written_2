import org.junit.*;

import static org.junit.Assert.assertEquals;

public class testHW {
    @Test
    public void test() {
        Organization org = new Organization("My Org");
        org.donate(20);
        org.donate(50);

        EvilCode.beEvil(org);

        assertEquals("My Org", org.getFundName());
        assertEquals(70, org.total());

    }
}
