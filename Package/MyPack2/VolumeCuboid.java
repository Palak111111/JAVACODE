package MyPack2;
import MyPack1.AreaCuboid;
public class VolumeCuboid extends AreaCuboid 
{
	public VolumeCuboid()
	{
		
	}
	public VolumeCuboid(double l,double b,double h)
	{

	super(l,b,h);
	}
	public double volume()
	{
		return this.l*this.b*this.h;
		
	}
	
}