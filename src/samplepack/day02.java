package samplepack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day02 {
    @Test(dataProvider = "getData")
    public void homeloana(String username, String password){
        System.out.println("home loan for 1st method with data provider");
        System.out.println(username);
        System.out.println(password);
    }
    @Test
    public void homeloanb(){
        System.out.println("home loan for 2nd method");
    } @Test
    public void homeloanc(){
        System.out.println("home loan for 3d method");
    }
    @Test
    public void homeloand(){
        System.out.println("home loan for 1st method");
    }
    @DataProvider
    public  Object[][] getData(){
        Object[][] data = new Object[1][2];
        data[0][0]="nikhil.kumar9495";
        data[0][1]="KajuEatsDpanda";
        return data;

    }
}
