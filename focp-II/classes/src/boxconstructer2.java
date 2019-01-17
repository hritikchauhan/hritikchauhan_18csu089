class Box
{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d)
	{
       this.width = w;
       this.height = h;
       this.depth = d;
	}
	Box()
	{
		width=2;
		height=3;
		depth=4;
	}
	double volume()
	{
		double volume=width*height*depth;
	    return volume;
	}
}

 class Boxconstructer2
 {
 	public static void main (String [] args)
 	{
 	   Box b1=new Box(7,8,6);
 	   Box b2=new Box();
 	   System.out.println("b1.vol()");
 	   System.out.println("b2.vol()");
 	}
 }