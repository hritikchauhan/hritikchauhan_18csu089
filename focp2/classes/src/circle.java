class circle
{
	double radius;
	double findArea()
	{
		double area;
		area = 3.14 * radius *radius;
		return area;
	}
	void displayArea()
	{
		double Area;
		Area= findArea();
		System.out.println(Area);
	}
}