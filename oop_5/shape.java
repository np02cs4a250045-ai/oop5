package week_5Tutorial;

abstract class shape {
	
	abstract void getRectangleArea(int length, int breadth);
	abstract void getSquareArea(int side);
	abstract void getCircleArea(double radius);
}

class Area extends shape {
	
	@Override
    void getRectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
	}

	 @Override
	    void getSquareArea(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
}
	  @Override
	    void getCircleArea(double radius) {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }
	} 
	