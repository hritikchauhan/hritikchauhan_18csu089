import java.util.*;
class program1
{
	public static void main(String [] args)
	{
      int [] arr = new int[10];
      Scanner console = new Scanner (System.in);
      for(int i=0;i<5;i++)
      {
       System.out.println("enter value");
       arr[i] = console.nextInt();
      }	
     System.out.println("enter value to be searched");
     int search = console.nextInt();
     int index = -1;
     for(int i=0;i<5;i++ )
     {
      System.out.println("value at arr[" +i+ "] is: "+ arr[i]);
      if (search == arr[i])
      {
        index = i;
      }
     }
    System.out.println("index"+index);
	}
}