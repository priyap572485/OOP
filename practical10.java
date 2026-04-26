import java.util.Scanner;

class BankAccount {
String account_holder_name;
double balance;

static double interest_rate = 5.0;

BankAccount(String name, double balance) {
this.account_holder_name = name;
this.balance = balance;
}

double calculateInterest() {
return (balance * interest_rate) / 100;
}

void display() {
System.out.println("Account Holder Name: " + account_holder_name);
System.out.println("Balance: " + balance);
System.out.println("Interest Rate: " + interest_rate + "%");
System.out.println("Interest Earned: " + calculateInterest());
}
static void updateInterestRate(double newRate) {
interest_rate = newRate;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter account holder name: ");
String name = sc.nextLine();
System.out.print("Enter balance: ");
double bal = sc.nextDouble();
BankAccount acc = new BankAccount(name, bal);
System.out.println("\nBefore updating interest rate:");
acc.display();
System.out.print("\nEnter new interest rate: ");
double newRate = sc.nextDouble();

BankAccount.updateInterestRate(newRate);
System.out.println("\nAfter updating interest rate:");
acc.display();
}
}