package inheritance;

import org.testng.annotations.Test;

public class Child extends Parent{
    @Test
    public void  master(){
        PS2 ps= new PS2(3);
        System.out.println("main method code");
//        setup();
        System.out.println(ps.increment());
        System.out.println(ps.decrement());
//        PS3 ps3=new PS3(3);
        System.out.println(ps.mutiply());
        System.out.println(ps.mutiply1());
    }

}
