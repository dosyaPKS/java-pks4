import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal not processed.");
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account removed: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found with number: " + accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found with number: " + accountNumber);
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found with number: " + accountNumber);
    }
}

public class UserAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("1234131356", 122000);
        Account account2 = new Account("65413131321", 222000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.deposit("12345131236", 50230);
        bank.withdraw("6513134321", 10200);

        bank.removeAccount("12345131236");
    }
}
