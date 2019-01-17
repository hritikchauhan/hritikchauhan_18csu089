class Box
{
	double width;
	double height;
	double depth;
	void setDim(double w,double h,double d)
	{
       width = w;
       height = h;
       depth = d;
	}
	double volume()
	{
		double volume=width*height*depth;
	    return volume;
	}
}

 class Boxdemo
 {
 	public static void main (String [] args)
 	{
 		Box b = new Box();
 		b.setDim(2,3,4);
 		double vol=b.volume();
        System.out.print(vol);
 	}
 }