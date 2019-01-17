import java.util.*;
class array1
{
	static public void main(String args[])
	{
		Scanner con=new Scanner(System.in);
		System.out.println("Enter 5 Values in the array - ");
		int[] arr=new int[5];
		int check;
		for(int i=0;i<5;i++)
		{
			arr[i]=con.nextInt();
			check=arr[i]/100;
			if(check!=0)
			{
				System.out.print("Entered value is not 2 digit, Enter again : ");
				arr[i]=con.nextInt();
			}
		}
		System.out.print("Entered Array is - ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n\nNew Array is - ");
		for(int i=0;i<5;i++)
		{
			if(arr[i]%2!=0)
			{
				arr[i]=arr[i]*2;
			}
			System.out.print(arr[i]+"\t");
		}
	}
}