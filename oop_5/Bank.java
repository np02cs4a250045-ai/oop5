package week_5Tutorial;



abstract class Bank1 {
	abstract void getBalance();
	
}
class BankA extends Bank1{
	int balance = 100;
	@Override
			void getBalance() {
				System.out.println("Deposited amount $" + balance);
			}
		}
class BankB extends Bank1{
			int balance = 150;
			@Override
			void getBalance() {
				System.out.println("Deposited amount $" + balance);
		
			}
		}
class BankC extends Bank1{
			int balance = 200;
			@Override
			void getBalance() {
				System.out.println("Deposited amount $" + balance);
			}
		
	}

