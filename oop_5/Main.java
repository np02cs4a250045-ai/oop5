package week_5Tutorial;

public class Main {
	public static void main(String [] args){
	Bank1 a = new BankA();
	a.getBalance();
	
	
	Bank1 b = new BankB();
	b.getBalance();
	
	
	Bank1 c = new BankC();
	c.getBalance();
	
	Area obj = new Area();

    obj.getRectangleArea(10, 5);
    obj.getSquareArea(4);
    obj.getCircleArea(3.5);
	
    Employee m = new Manager();
    Employee d = new Developer();

    m.printEmployeeId();
    m.printSalary();

    d.printEmployeeId();
    d.printSalary();
}
	}
	


