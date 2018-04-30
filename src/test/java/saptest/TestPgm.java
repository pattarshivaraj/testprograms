package saptest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPgm {

    @Test(alwaysRun = true)
    public void runStringTest() {
        String str = "TestNG is working fine";
        Assert.assertEquals("TestNG is working fine", str);
        System.out.println("assert equals");
        Assert.assertNotEquals("TestNG is working fin", str);
        System.out.println("assert equals fails");
    }
}
