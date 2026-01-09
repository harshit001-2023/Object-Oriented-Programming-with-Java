package Inheritance.intro.Assignment;

class Customer {
    private String customerName;
    private int creditPoints;

    public Customer(String customerName, int creditPoints) {
        this.customerName = customerName;
        this.creditPoints = creditPoints;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    @Override
    public String toString() {
        return customerName;  // Return only customerName as required
    }
}

class CardType {
    private Customer customer;
    private String cardType;

    public CardType(Customer customer, String cardType) {
        this.customer = customer;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return String.format("The Inheritance.intro.Assignment.Customer '%s' Is Eligible For '%s' Card.",
                customer.toString(), cardType);
    }
}

class CardsOnOffer {
    public static CardType getOfferedCard(Customer customer) {
        int points = customer.getCreditPoints();
        String cardType;

        if (points >= 100 && points <= 500) {
            cardType = "Silver";
        } else if (points >= 501 && points <= 1000) {
            cardType = "Gold";
        } else if (points > 1000) {
            cardType = "Platinum";
        } else {
            cardType = "EMI";
        }

        return new CardType(customer, cardType);
    }
}

class Main {
    void main() {
        // Reading input
        String name = IO.readln();
        int points = Integer.parseInt(IO.readln());

        // Create customer
        Customer customer = new Customer(name, points);

        // Get offered card
        CardType offeredCard = CardsOnOffer.getOfferedCard(customer);

        // Print result
        IO.println(offeredCard.toString());
    }
}