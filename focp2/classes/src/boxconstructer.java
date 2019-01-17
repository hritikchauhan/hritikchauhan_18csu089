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

 class Boxconstructer
 {
 	public static void main (String [] args)
 	{
 		Box b = new Box();
 		double vol=b.volume();
        System.out.print(vol);
 	}
 }