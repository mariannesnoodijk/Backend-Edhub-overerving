public class Customer {

        String name;
        String lastName;
        int customerNumber;
        private CreditCard creditcard;



        public Customer(String name, String lastName, CreditCard creditcard) {
                this.name = name;
                this.lastName = lastName;
                this.creditcard = creditcard;
        }

        public Customer(String name, String lastName, int customerNumber, CreditCard creditcard) {
                this.name = name;
                this.lastName = lastName;
                this.customerNumber = customerNumber;
                this.creditcard = creditcard;

        }
        public void printName() {
                System.out.println("Customer " + name);
        }

        public CreditCard getCreditcard() {
                return creditcard;
        }

        public void setCreditcard(CreditCard creditcard) {
                this.creditcard = creditcard;
        }
}
