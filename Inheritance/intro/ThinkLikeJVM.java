package Inheritance.intro;

class Super{
    int x = 100;

    public Super() {
        super();
        show();
    }

    public void show(){
        IO.println("X Value from super class : "+x);
    }
}
class Sub extends Super{
    int x = 200;
    public Sub(){
        super();
    }
    public void show(){
        IO.println("This sho method is executed because object is created 4 sub class.");
        IO.println("X value from sub class :"+x);
    }
}
public class ThinkLikeJVM {
    static void main() {
        new Sub();
    }
}
// X value from sub class :0
