class circle
{
	private double radius;
	private String colour;

	public circle()
	{
	this.radius=1.0;
	this.colour="red";
	}
	public circle(double r,String c)
	{
	this.radius=r;
	this .colour=c;
	}
	public circle(double r)
	{
	this.radius=r;
	this.colour="red";
	}
	public double getRadius(){return radius;}
	public void setRadius(double r){this.radius=r;}
	public String getcolour(){return colour;}
	public void setcolour(String s){colour=s;}
	public double getArea(){return 3.14*radius*radius;}
}