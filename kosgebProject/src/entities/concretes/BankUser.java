package entities.concretes;

public class BankUser{
    private int bankUserId;
    private Bank bank;
    private User user;

    public BankUser() {
    }

    public BankUser(int bankUserId, Bank bank, User user) {
        this.bankUserId = bankUserId;
        this.bank = bank;
        this.user = user;
    }

    public int getBankUserId() {
        return bankUserId;
    }

    public void setBankUserId(int bankUserId) {
        this.bankUserId = bankUserId;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
