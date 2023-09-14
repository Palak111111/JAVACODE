package MyPack3;
import MyPack2.VolumeCube;
public class DensityCube extends VolumeCube 
{
    double m;
	public DensityCube()
	{
		
	}
	public DensityCube(double a,double m)
	{
	super(a);
	this.m=m;
	}
	public double density()
	{
		return this.m/super.volume();
		
	}
	
}