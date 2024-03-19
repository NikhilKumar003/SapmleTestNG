package samplepack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day03 {
    @Test
    public void carloana(){
        System.out.println("car loan for 1st method");
    } @Test(groups = {"Smoke"})
    public void carloanb(){
        System.out.println("car loan for 2nd method");
    } @Test
    public void carloanc(){
        System.out.println("car loan for 3rd method");
    }
    @Parameters({"url"})
    @Test
    public void carloand(String urlname){
        System.out.println("car loan for 2nd method with parameters concept");
        System.out.println(urlname);
    }
    public void carloane(){
        System.out.println("car loan for 2nd method");
    }
}
