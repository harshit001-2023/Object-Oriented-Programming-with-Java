package Threads;

/*Thead Assignment :
------------------------------
Develop a scenario based program by using Multithreading for OLA cab booking
process

Create 6 BLC classes which extending from Thread OR Anonymous inner class
approach which are as follows :

1) RideRequest
2) DriverAssignment
3) FareCalculation
4) LiveTracking
5) PaymentProcessing
6) RatingSystem

Instruction :
-------------
Override run() method in all the above classes

a) run() method implementation for RideRequest class :
   It should print a message "User requested a ride...". User should wait
   for 2 seconds, after that, It should print a message "Searching for nearby drivers..."

b) run() method implementation for DriverAssignment class
   It should wait for 3 seconds and then print a message "Driver found and assigned!"

c) run() method implementation for FareCalculation class
   It should print a message "Calculating estimated fare...", Here Thread
   should wait for 1.5 second and then it should print "Estimated fare: 135.75 RS."

d) run() method implementation for LiveTracking class
   Here you should write the logic to update the ride location in % [See the
   output Test cases for more details]
   After that it should print a message "Ride Completed".

e) run() method implementation for PaymentProcessing class :
   It should print a message "Processing payment..." Here Thread should
   wait for 2 seconds then It should print "Payment successful!"

f) run() method implementation for RatingSystem class :
   It should print a message "Requesting user rating...". Here Thread should
   wait for 1 second and It should print "User rated the ride: 5 star"



 Create an ELC class called OlaRidingApp.

 Inside main method Create the object for all 6 six classes using Ordinary
 Or Anonymous inner class approach :

  Instruction :

  a) start RideRequest and FareCalculation thread together
  b) call join() method on RideRequest thread

  Note : In the same use start() and join() to get the following output :


  Test Cases for Output :
  ------------------------
  User requested a ride...
    Calculating estimated fare...
    Estimated fare: 135.75 RS.
    Searching for nearby drivers...
    Driver found and assigned!
    Updating ride location... 20% completed
    Updating ride location... 40% completed
    Updating ride location... 60% completed
    Updating ride location... 80% completed
    Updating ride location... 100% completed
    Ride completed!
    Processing payment...
    Payment successful!
    Requesting user rating...
    User rated the ride: 5 star*/

class RideRequest extends Thread{
    @Override
    public void run(){
        System.out.println("User Requested a Ride...");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Searching for nearby drivers...");
    }
}

class DriverAssignment extends Thread{
    @Override
    public void run(){
        try{
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Driver Assigned to Ride...");
    }
}

class FareCalculation extends Thread{
    @Override
    public void run(){
        System.out.println("Calculating Estimated fare...");
        try{
            sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Estimated Fare: 135.75 RS");
    }
}

class LiveTracking extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Updating ride location... "+i*20+"% completed");
            try {
                sleep(10*100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Ride Completed!");
    }
}

class PaymentProcessing extends Thread{
    @Override
    public void run(){
        System.out.println("Payment Processing...");
        try{
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Payment Processing Completed...");
    }
}

class RatingSystem extends Thread{
    @Override
    public void run(){
        System.out.println("Requested user rating...");
        try{
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User rated the ride: 5 star...");
    }
}

public class OlaRidingApp {
    public static void main(String[] args) {
        RideRequest rideRequest = new RideRequest();
        DriverAssignment driverAssignment = new DriverAssignment();
        FareCalculation fareCalculation = new FareCalculation();
        LiveTracking liveTracking = new LiveTracking();
        PaymentProcessing paymentProcessing = new PaymentProcessing();
        RatingSystem ratingSystem = new RatingSystem();

        System.out.println("--- Ola App Started ---");

        try {
            // a) Start RideRequest and FareCalculation together
            rideRequest.start();
            fareCalculation.start();

            // b) Call join() on RideRequest
            rideRequest.join();
            fareCalculation.join(); // Joining fare too so driver assignment starts after both

            // Sequence management using start and join
            driverAssignment.start();
            driverAssignment.join();

            liveTracking.start();
            liveTracking.join();

            paymentProcessing.start();
            paymentProcessing.join();

            ratingSystem.start();
            ratingSystem.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("--- Trip Finished ---");
    }
}
