package wrapperclass;

/*Program 01 :
------------
Create an application to compare two objects based on the content by overriding the equals(Object obj) method of Object class.

Create a BLC class called Product

Instance variables :
private int productId
private String productName

Create a parameterized constructor to initialize all properties.

Override equals(Object obj) method from Object class to compare the content of Product object, Make sure that if end user try to compare
the content of two different objects (Product and Employee) then program should provide proper message.

Create an ELC class ProductEquality to test your application by creating two objects of Product class to compare the content by
calling Product class overridden equals(Object obj) method.

Follow the equals() and hashCode() contract.*/

public class ProductEquality {
    static void main() {
        Product product = new Product(121, "Mobile Phone");
        Product product1 = new Product(121, "Mobile Phone");

        if(product.equals(product1)) {
            System.out.println("Product equal");
        } else {
            System.out.println("Product not equal");
        }
    }
}

class Product{
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product)obj;
        return this.productId == product.productId && this.productName.equals(product.productName);
    }
}
