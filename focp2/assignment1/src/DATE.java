class DATE
{
	int day;
	int month;
	int year;
	
	DATE(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	void daout()
	{
		System.out.print(day+"/"+month+"/"+year);
	}
}