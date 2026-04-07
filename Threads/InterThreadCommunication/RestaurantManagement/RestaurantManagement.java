package Threads.InterThreadCommunication.RestaurantManagement;

//Develop a scenario based program by using ITC to complete offline
//Order Delivery System in a Restaurant.
//
//The scenario is :
//A Restaurant waiter will place the food to order to chef and waiting for
//food preparation.
//A Restaurant chef will prepare the food and notify the waiter after
//preparation.
//
//Coding Requirements:
//        --------------------
//Create a BLC class called Restaurant.
//
//Fields/Attributes/Properties [private access modifier]
//        ------------------------------------------------------
//name:String
//order:String
//boolean isOrderReady = false; //[Initial Order Status]
//
//Take a paraneterized constructor to initialize the Restaurant name.
//
//        Methods :
//        ---------
//        1) Method Name 		: placeOrder()
//Parameter   		: order of type STring
//Return Type 		: void
//Access modifier		: public
//Modifier			: synchronized
//In this method initialize the order through parameter variable. After
//placing the order, Waiter will Wait until chef notifies that food is ready. Once waiter will get notification from chef, Waiter can serve
//the food.
//
//        2) Method Name 		: prepareOrder()
//Parameter   		: No Parameter
//Return Type 		: void
//Access modifier		: public
//Modifier			: synchronized
//In this method chef will prepare the food.It will take some time
//based on food. After food preparation, It will notify to the waiter
//so waiter can server the food.
//
//        3) Create a getter method getRestaurantName() to get the name of the
//Restaurant.
//
//Take another BLC class called Waiter which extends from Thread
//
//        Fields/Attributes/Properties [private access modifier]
//        ------------------------------------------------------
//restaurant Restaurant
//orderName  String
//
//Take a parameterized constructor to initialize the restaurant property.
//
//        Methods :
//        ---------
//        1) Method Name 		: acceptOrder()
//Parameter   		: orderName of type STring
//Return Type 		: void
//Access modifier		: public
//In this method take the order from the customer and initialize non static variable.
//
//   2) Override the run method, inside this run method place the customer oder
//in the Restaurant for preparation.
//
//Take another BLC class called Chef which extends from Thread
//
//        Fields/Attributes/Properties [private access modifier]
//        ------------------------------------------------------
//restaurant Restaurant
//
//Take a parameterized constructor to initialize the restaurant property.
//
//        Methods :
//        ---------
//        1) Override the run method, inside this run method prepare the customer oder
//in the Restaurant for serving.
//
//
//Create one ELC class RestaurantSystem to get the following order of Output :
//
//Output Format :
//        ----------------
//Welcome to KFC Restaurant!!!
//Waiter: Placed order for fried chicken
//Chef: Preparing fried chicken
//Chef: fried chicken is ready!
//Waiter: Serving the fried chicken

class Restaurant extends Thread{
    private String name;
    private String order;
    private boolean isOrderReady = false;

    public Restaurant(String name){
        this.name=name;
    }

    public String getRestaurantName() {
        return name;
    }

    public synchronized void placeOrder(String order){
        this.order=order;

        try {
            while(!isOrderReady){
                wait();
            }
            IO.println("Placed order for "+name);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void prepareOrder(){
        if(!isOrderReady){
            IO.println("Preparing order for "+name);
            isOrderReady=true;
            notify();
        }

    }
}

class Waiter extends Thread{
    private Restaurant restaurant;
    private String orderName;

    public Waiter(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    public void acceptOrder(String orderName){
        this.orderName=orderName;
    }

    public void run(){
        acceptOrder("Fried Chiken");
        restaurant.placeOrder("Fried Chicken");
    }
}

class Chef extends Thread{
    private Restaurant restaurant;

    public Chef(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    public void run(){
        restaurant.prepareOrder();
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("KFC");

        Waiter waiter = new Waiter(restaurant);
        Chef chef = new Chef(restaurant);

        waiter.setName("Waiter Thread");
        chef.setName("Chef Thread");

        System.out.println("Welcome to " + restaurant.getRestaurantName() + " Restaurant!!!");
        System.out.println("----------------------------------------");

        waiter.start();
        chef.start();

        try {
            waiter.join();
            chef.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------");
        System.out.println("Order delivery completed!");
    }
}
