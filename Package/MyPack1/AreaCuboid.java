package MyPack1;
public class AreaCuboid
{
    public double l,b,h;
   public AreaCuboid()
   {
	   
   }
    public AreaCuboid(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public double tsa()
	{
		return 2*(this.l+this.b*this.b+this.h*this.h+this.l);
		
	}

}