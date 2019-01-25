import java.util.*;
class dis
{
	public static void main(String args[])
     {
	   int x1,x2,y1,y2;
	   double dis;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter x1:");
	   x1 = sc.nextInt();
	   System.out.println("enter x2:");
	   x2 = sc.nextInt();
	   System.out.println("enter y1:");
	   y1 =  sc.nextInt();
	   System.out.println("enter y2:");
	   y2 = sc.nextInt();
       dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
       System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
     }
}