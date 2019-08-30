package corejava;
interface MotorBike
{
	int speed=50;
	public void totalDistance();
}

interface Cycle
{
	int distance =150;
	public void speed();
}

public class TwoWheeler implements MotorBike,Cycle
{
int totalDistance;
int avgspeed;
public void totalDistance()
{
	totalDistance=speed*distance;
	System.out.println("tot dist travld:"+totalDistance);
}
public void speed()
{
	int avgSpeed=totalDistance/speed;
	System.out.println("avg speed maintd:"+avgSpeed);
}
public static void main(String[] args)
{
	TwoWheeler t1=new TwoWheeler();
	t1.totalDistance();
	t1.speed();
}
}