class A
{
    int val = 100;
    A()
    {
        init();
    }
    void init()
    {
        System.out.println("A: " + val);
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
        System.out.println("B: " + val);
    }
}
class Test
{
    public static void main(String[] args)
    {
        new B();
    }
}
