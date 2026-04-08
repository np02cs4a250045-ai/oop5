package week_5Tutorial;

abstract class Parents{
	abstract void message();
}

class childclass1 extends Parents{
	@Override
	void message() {
		System.out.println("This is first Subclass");
	}
	
}

class childclass2 extends Parents{
	@Override
	void message() {
		System.out.println("This is second class");
	}
}
