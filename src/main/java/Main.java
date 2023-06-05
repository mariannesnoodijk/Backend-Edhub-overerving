public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Koen", "Diepstraten", new VisaCard(0)); // variabel aanmaken met naam customer voor Class Customer
        Customer customer2 = new Customer("Marianne", "Kaka", 1, new MasterCard(0));

        System.out.println(customer.name);


        customer.printName(); // refereert naar info in andere klasse.
        customer2.printName(); // refereert naar info in andere klasse.

        customer.getCreditcard().pay(100);
        System.out.println(customer.getCreditcard().getDebt());

    }

    }
