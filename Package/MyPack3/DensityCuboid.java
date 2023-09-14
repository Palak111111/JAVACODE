package MyPack3;
//import MyPack1.AreaCuboid;
import MyPack2.VolumeCuboid;
public class DensityCuboid extends VolumeCuboid 
{
    double m;
	public DensityCuboid()
	{
		
	}
	public DensityCuboid(double l,double b,double h,double m)
	{
	super(l,b,h);
	this.m=m;
	}
	public double density()
	{
		return this.m/super.volume();
		
	}
	
}