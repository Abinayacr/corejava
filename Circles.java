package corejava;

public class Circles implements Shapes{
private double radius;
public Circles(double r){
this.radius=r;
}
@Override
public void draw(){
	System.out.println("Drawing circle");
}
@Override
public double getArea() {
	return Math.PI*this.radius*this.radius;
}
public double getRadius() {
	return this.getRadius();
}
}

