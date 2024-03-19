package inheritance;

public class PS2  extends PS3{
    int a ;
    //utils class-1

    //we used concept of constructor with ps2 class, here we also
    //used parameterized constructor with *this* keyword
    public PS2(int a) {
        super(a);
        this.a=a;
    }

    public int increment(){
        a=a+1;
        return  a;
    }
    public int decrement(){
        a=a-1;
        return a;
    }
}
