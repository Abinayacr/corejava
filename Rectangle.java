package corejava;

public class Rectangle implements Shapes {

	
	private double width;
	private double height;
	
	public Rectangle(double w, double h)
	{
		this.width=w;
		this.height=h;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
