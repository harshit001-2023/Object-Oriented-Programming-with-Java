/*
Question: Mobile Phone SIM Card Interaction
_______________________________________________

You are tasked with implementing a simulation of a mobile phone interacting with different SIM cards. The goal is to create a system where mobile phones can insert, remove, and use SIM cards from different providers.

Components:
--------------

-> SIMCardInterface: An interface that defines methods for getting phone number, network provider, and activation/deactivation of a SIM card.

-> Jio, Airtel, and BSNL Classes: These classes should implement the SIMCardInterface. Each class represents a SIM card from a different network provider (Jio, Airtel, and BSNL) and should have provider-specific details.

-> MobilePhoneInterface: An interface that defines methods for inserting, removing SIM cards, making calls, and sending text messages.

-> MobilePhone Class: This class should implement the MobilePhoneInterface. It should have a slot for inserting a SIM card and methods for making calls and sending texts.

Tasks:
----------

-> Implement the SIMCardInterface and the classes Jio, Airtel, and BSNL that implement this interface. Include methods for getting phone number, network provider, and activating/deactivating the SIM card.

-> Implement the MobilePhoneInterface and the MobilePhone class that implements this interface. The MobilePhone class should allow inserting and removing SIM cards, making calls, and sending texts.

-> Demonstrate the interaction between mobile phones and different SIM cards:

->Create instances of Jio, Airtel, and BSNL SIM cards.
->Create a MobilePhone instance.
->Insert a SIM card into the mobile phone.
->Make a call and send a text message using the inserted SIM card.
->Remove the SIM card from the mobile phone.
->Discuss how the use of interfaces (SIMCardInterface and MobilePhoneInterface) promotes a loosely coupled architecture and allows flexibility in swapping different SIM cards.

[Note: You can provide the classes with appropriate constructors and methods as needed for the implementation.]

Hints:
--------------
Define the interfaces with the required methods and let the classes implement them.
Consider including print statements to indicate the activation, deactivation, insertion, and removal of SIM cards.
Focus on encapsulation, polymorphism, and the benefits of using interfaces in promoting modular and flexible code.
Feel free to adjust the details and wording of the question according to your preferences and the level of understanding you want to assess.
*/

import java.util.Scanner;

/*
 Mobile Phone SIM Card Interaction
 JDK 25 Preview Version (IO.readln, IO.println)
*/

void main(String[] args) {

    SimCardInterface sim = null;
    MobilePhone phone = new MobilePhone();

    char choice = 'y';

    while (choice == 'y' || choice == 'Y') {

        IO.println("""
            Choose SIM:
            1. Jio
            2. Airtel
            3. BSNL
            """);

        int simChoice = Integer.parseInt(IO.readln());

        IO.println("Enter phone number:");
        long number = Long.parseLong(IO.readln());

        switch (simChoice) {
            case 1 -> sim = new Jio(number, true);
            case 2 -> sim = new Airtel(number, true);
            case 3 -> sim = new Bsnl(number, true);
            default -> {
                IO.println("Invalid choice");
                continue;
            }
        }

        phone.insertingSimCard(sim);
        phone.makingCalls();
        phone.sendingTextMessages();
        phone.removingSimCard();

        IO.println("Continue? (y/n)");
        choice = IO.readln().charAt(0);
    }
}

interface SimCardInterface {
    long phoneNumber();
    String networkProvider();
    boolean isActivte();
}

static class Jio implements SimCardInterface {
    long phoneNumber;
    boolean activationStatus;

    public Jio(long phoneNumber, boolean activationStatus) {
        this.phoneNumber = phoneNumber;
        this.activationStatus = activationStatus;
    }

    public long phoneNumber() {
        return phoneNumber;
    }

    public String networkProvider() {
        return "Jio";
    }

    public boolean isActivte() {
        return activationStatus;
    }
}

static class Airtel implements SimCardInterface {
    long phoneNumber;
    boolean activationStatus;

    public Airtel(long phoneNumber, boolean activationStatus) {
        this.phoneNumber = phoneNumber;
        this.activationStatus = activationStatus;
    }

    public long phoneNumber() {
        return phoneNumber;
    }

    public String networkProvider() {
        return "Airtel";
    }

    public boolean isActivte() {
        return activationStatus;
    }
}

static class Bsnl implements SimCardInterface {
    long phoneNumber;
    boolean activationStatus;

    public Bsnl(long phoneNumber, boolean activationStatus) {
        this.phoneNumber = phoneNumber;
        this.activationStatus = activationStatus;
    }

    public long phoneNumber() {
        return phoneNumber;
    }

    public String networkProvider() {
        return "BSNL";
    }

    public boolean isActivte() {
        return activationStatus;
    }
}

interface MobilePhoneInterface {
    void insertingSimCard(SimCardInterface sc);
    void removingSimCard();
    void makingCalls();
    void sendingTextMessages();
}

static class MobilePhone implements MobilePhoneInterface {

    private SimCardInterface sim;

    public void insertingSimCard(SimCardInterface sc) {
        sim = sc;
        IO.println("SIM Inserted: " + sim.networkProvider());
    }

    public void removingSimCard() {
        IO.println("SIM Removed: " + sim.networkProvider());
        sim = null;
    }

    public void makingCalls() {
        if (sim != null && sim.isActivte()) {
            IO.println("Calling from " + sim.phoneNumber());
        } else {
            IO.println("No active SIM");
        }
    }

    public void sendingTextMessages() {
        if (sim != null && sim.isActivte()) {
            IO.println("Sending SMS via " + sim.networkProvider());
        } else {
            IO.println("No active SIM");
        }
    }
}
