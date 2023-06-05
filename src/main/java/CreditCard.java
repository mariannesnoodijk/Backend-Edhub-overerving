abstract class CreditCard {
    private int debt;

    public CreditCard(int debt) { // constructor
        this.debt = debt;
    }

    void pay(int amount) {
        this.debt = this.debt + amount;
    }
    public int getDebt() { // getter
        return debt;
    }

    public void setDebt(int debt) { // setter
        this.debt = debt;
    }

}
