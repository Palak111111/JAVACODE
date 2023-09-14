package MyPack2;
import MyPack1.AreaCube;
public class VolumeCube extends AreaCube 
{
	public VolumeCube()
	{
		
	}
	public VolumeCube(double a)
	{

	super(a);
	}
	public double volume()
	{
		return this.a*this.a*this.a;
		
	}
	
}