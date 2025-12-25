package Inheritance.intro;

class Alpha{
    protected int x = 100;
}
class Beta extends Alpha{
    protected int x = 200;
    public static void access(){
        Beta beta = new Beta();
        IO.println(beta.x);
//        Alpha alpha = beta;
//        IO.println(alpha.x);
        IO.println(((Alpha)beta).x);
    }
}

public class IQ {
    void main(){
        Beta.access();
    }
}
