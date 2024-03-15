package samplepack;

import org.testng.annotations.*;

public class day01 {

    @BeforeClass
    public void day0010(){
        System.out.println("BEFORE CLASS personal loan  day01");
    }
    @Test
    public void day0011(){
        System.out.println("personal loan MAIN TEST day01");
    } @AfterClass
    public void day0012(){
        System.out.println("AFTER CLASS personal loan  day01");
    }
    @BeforeMethod
    public void day0013(){
        System.out.println("BEFORE METHOD personal loan first module day01");
    }
    @AfterMethod
    public void day0014(){
        System.out.println("AFTER METHOD personal loan first module day01");
    }
    @BeforeTest
    public void day0015(){
        System.out.println("personal loan BEFORE TEST day01");
    }
    @AfterTest
    public void day0016(){
        System.out.println("personal loan first AFTER TEST day01");
    }

}
