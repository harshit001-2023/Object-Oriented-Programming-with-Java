/*
Question: Mobile Phone SIM Card Interaction
_______________________________________________

You are tasked with implementing a simulation of a mobile phone interacting with different SIM cards. The goal is to create a system where mobile phones can insert, remove, and use SIM cards from different providers.
*/

import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    MobilePhone phone = new MobilePhone();
    
    System.out.println("=== Mobile Phone SIM Card Simulation ===\n");
    
    char choice = 'y';
    while(choice == 'y' || choice == 'Y'){
        System.out.println("\nSelect SIM Card Provider:");
        System.out.println("1. Jio");
        System.out.println("2. Airtel");
        System.out.println("3. BSNL");
        System.out.print("Enter your choice (1-3): ");
        
        int simChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter phone number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // consume newline
        
        SimCardInterface simCard = null;
        
        switch(simChoice) {
            case 1:
                simCard = new Jio(phoneNumber, "Jio", true);
                break;
            case 2:
                simCard = new Airtel(phoneNumber, "Airtel", true);
                break;
            case 3:
                simCard = new Bsnl(phoneNumber, "BSNL", true);
                break;
            default:
                System.out.println("Invalid choice!");
                continue;
        }
        
        // Insert SIM card
        phone.insertingSimCard(simCard);
        
        // Perform operations
        System.out.println("\nSelect operation:");
        System.out.println("1. Make a call");
        System.out.println("2. Send a text message");
        System.out.println("3. Both");
        System.out.print("Enter your choice (1-3): ");
        
        int operation = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch(operation) {
            case 1:
                phone.makingCalls(simCard);
                break;
            case 2:
                phone.sendingTextMessages(simCard);
                break;
            case 3:
                phone.makingCalls(simCard);
                phone.sendingTextMessages(simCard);
                break;
            default:
                System.out.println("Invalid operation!");
        }
        
        // Remove SIM card
        phone.removingSimCard(simCard);
        
        System.out.print("\nDo you want to continue? (y/n): ");
        choice = scanner.next().charAt(0);
        scanner.nextLine(); // consume newline
    }
    
    System.out.println("\n=== Thank you for using Mobile Phone Simulation ===");
    scanner.close();
}

interface SimCardInterface {
    long phoneNumber();
    String networkProvider();
    boolean isActive();
    void activate();
    void deactivate();
}

static class Jio implements SimCardInterface {
    private long phoneNumber;
    private String networkProvider;
    private boolean activationStatus;

    public Jio(long phoneNumber, String networkProvider, boolean activationStatus) {
        this.phoneNumber = phoneNumber;
        this.networkProvider = networkProvider;
        this.activationStatus = activationStatus;
        if(activationStatus) {
            System.out.println("Jio SIM card activated with number: " + phoneNumber);
        }
    }

    @Override
    public long phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String networkProvider() {
        return networkProvider;
    }

    @Override
    public boolean isActive() {
        return activationStatus;
    }
    
    @Override
    public void activate() {
        activationStatus = true;
        System.out.println("Jio SIM card activated.");
    }
    
    @Override
    public void deactivate() {
        activationStatus = false;
        System.out.println("Jio SIM card deactivated.");
    }
}

static class Airtel implements SimCardInterface {
    private long phoneNumber;
    private String networkProvider;
    private boolean activationStatus;

    public Airtel(long phoneNumber, String networkProvider, boolean activationStatus) {
        this.phoneNumber = phoneNumber;
        this.networkProvider = networkProvider;
        this.activationStatus = activationStatus;
        if(activationStatus) {
            System.out.println("Airtel SIM card activated with number: " + phoneNumber);
        }
    }

    @Override
    public long phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String networkProvider() {
        return networkProvider;
    }

    @Override
    public boolean isActive() {
        return activationStatus;
    }
    
    @Override
    public void activate() {
        activationStatus = true;
        System.out.println("Airtel SIM card activated.");
    }
    
    @Override
    public void deactivate() {
        activationStatus = false;
        System.out.println("Airtel SIM card deactivated.");
    }
}

static class Bsnl implements SimCardInterface {
    private long phoneNumber;
    private String networkProvider;
    private boolean activationStatus;

    public Bsnl(long phoneNumber, String networkProvider, boolean activationStatus) {
        this.phoneNumber = phoneNumber;
        this.networkProvider = networkProvider;
        this.activationStatus = activationStatus;
        if(activationStatus) {
            System.out.println("BSNL SIM card activated with number: " + phoneNumber);
        }
    }

    @Override
    public long phoneNumber() {
        return phoneNumber;
    }

    @Override
    public String networkProvider() {
        return networkProvider;
    }

    @Override
    public boolean isActive() {
        return activationStatus;
    }
    
    @Override
    public void activate() {
        activationStatus = true;
        System.out.println("BSNL SIM card activated.");
    }
    
    @Override
    public void deactivate() {
        activationStatus = false;
        System.out.println("BSNL SIM card deactivated.");
    }
}

interface MobilePhoneInterface{
    void insertingSimCard(SimCardInterface sc);
    void removingSimCard(SimCardInterface sc);
    void makingCalls(SimCardInterface sc);
    void sendingTextMessages(SimCardInterface sc);
}

static class MobilePhone implements MobilePhoneInterface{
    private SimCardInterface currentSim;

    public MobilePhone(){
        this.currentSim = null;
    }

    @Override
    public void insertingSimCard(SimCardInterface sc) {
        if(currentSim != null) {
            System.out.println("Please remove the existing SIM card first!");
            return;
        }
        currentSim = sc;
        System.out.println("\n[" + sc.networkProvider() + "] SIM card inserted successfully!");
        System.out.println("Phone Number: " + sc.phoneNumber());
        System.out.println("Network Provider: " + sc.networkProvider());
        System.out.println("Status: " + (sc.isActive() ? "Active" : "Inactive"));
    }

    @Override
    public void removingSimCard(SimCardInterface sc) {
        if(currentSim == null) {
            System.out.println("No SIM card to remove!");
            return;
        }
        System.out.println("\n[" + sc.networkProvider() + "] SIM card removed successfully!");
        sc.deactivate();
        currentSim = null;
    }

    @Override
    public void makingCalls(SimCardInterface sc) {
        if(!sc.isActive()) {
            System.out.println("Cannot make call. SIM card is not active!");
            return;
        }
        System.out.println("\n[" + sc.networkProvider() + "] Making call from " + sc.phoneNumber() + "...");
        System.out.println("Call connected!");
    }

    @Override
    public void sendingTextMessages(SimCardInterface sc) {
        if(!sc.isActive()) {
            System.out.println("Cannot send text. SIM card is not active!");
            return;
        }
        System.out.println("\n[" + sc.networkProvider() + "] Sending text message from " + sc.phoneNumber() + "...");
        System.out.println("Message sent successfully!");
    }
}