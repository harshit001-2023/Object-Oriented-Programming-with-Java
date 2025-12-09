package Basics.blc;

public class Product {
    private int id;
    private String name;
    private double price;

    public void setProductDetails(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;

        if (price <= 0) {
            System.err.println("Price can't be Zero or Negative, Enter valid Price.");
            System.exit(0);
        }
    }

    public void calculateDiscount(){
        double fivePercentDis = (price * 0.05);
        double tenPercentDis = (price * 0.1);
        double fifteenPercentDis = (price * 0.15);

        if(price < 1000) IO.println("Discount amount = "+fivePercentDis+"\nDiscounted Price is "+(price-fivePercentDis));
        else if (price >= 1000 && price <= 5000) IO.println("Discount amount = "+tenPercentDis+"\nDiscounted Price is "+(price-tenPercentDis));
        else IO.println("Discount amount = "+fifteenPercentDis+"\nDiscounted Price is "+(price-fifteenPercentDis));
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
