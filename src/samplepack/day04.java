package samplepack;

import org.testng.annotations.*;

public class day04 {
    @BeforeTest
    public void day0040() {
        System.out.println("BEFORE TEST App loan for day04");
    }

    @Test(groups = {"Smoke"})
    public void day0041() {
        System.out.println("TEST APP loan for 2nd day04");
    }

    @AfterTest
    public void day0042() {
        System.out.println("AFTER TEST App loan for 3rd day04");
    }

    @BeforeMethod
    public void day0043() {
        System.out.println("BEFORE METHOD APP loan for 2nd day04");
    }

    @AfterMethod
    public void day0044() {
        System.out.println("AFTER METHOD APP loan for 2nd day04");
    }

    @BeforeClass
    public void day0045() {
        System.out.println("BEF CLASS APP loan for 2nd day04");
    }

    @AfterClass
    public void day0046() {
        System.out.println("AFTER CLASS APP loan for 2nd day04");
    }
    @Parameters({"url","api/username"})
    @Test
    public void day0047(String urlnme, String key) {
        System.out.println("AFTER TEST App loan for 3rd day04 with parameter concept");
        System.out.println(urlnme);
        System.out.println(key);
    }
}
