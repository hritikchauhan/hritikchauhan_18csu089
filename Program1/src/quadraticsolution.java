import java.util.*;
class quadraticsolution
{
	public static void main(String args[])
	{
		scanner z = new scanner(system.in);
                int a,b;
                a=z.nextInt();
                b=z.nextInt(); 
		double temp1 = Math.sqrt(b*b-4*a*c);
		double root1 = (-b + temp1) / (2*a);
		double root2 = (-b - temp1) / (2*a);
		System.out.println(root1);
                System.out.println(root2);

	}
}