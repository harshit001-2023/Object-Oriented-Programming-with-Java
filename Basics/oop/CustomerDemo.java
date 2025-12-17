package Basics.oop;

public class CustomerDemo
{
    void main()
    {
        int val = 100;
        Customer c = new Customer("Ravi", 2);
        m1(c);
            //[Only 1 object i.e 3000x is eligiblr for GC]
        System.out.println(c.getId());
    }
    public void m1(Customer cust)
    {
        cust.setId(5);
        cust = new Customer("Rahul", 7);
        cust.setId(9);
        System.out.println(cust.getId());
    }
}

class Customer
{
    private String name;
    private int id;
    public Customer(String name, int id)
    {
        super();
        this.name=name;
        this.id=id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
}
