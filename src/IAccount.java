public interface IAccount {

    void Deposit(double amount);
    double withdraw(double amount);
    double GetCurrentBalance();
    int GetAccountNumber();
}
