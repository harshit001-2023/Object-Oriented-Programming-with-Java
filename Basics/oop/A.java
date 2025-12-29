package Basics.oop;

class A
{
    int val = 100;
    A()
    {
        init();
    }
    void init()
    {
        System.out.println("Basics.oop.A: " + val);
    }
}
class B extends A
{
    int val = 200;
    B()
    {
        init();
    }
    void init()
    {
        System.out.println("Basics.oop.B: " + val);
    }
}
class Test
{
    public static void main(String[] args)
    {
        new B();
    }
}
