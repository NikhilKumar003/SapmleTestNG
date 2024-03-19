package inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent {
    @BeforeMethod
    public void setup(){
        System.out.println("launching the browser");
    }

    @AfterMethod
    public void exit(){
        System.out.println("closing the browser");
    }
}
